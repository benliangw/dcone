package com.dcone.dtss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dcone.dtss.dao.LuckyDAO;
import com.dcone.dtss.dao.WalletDAO;
import com.dcone.dtss.model.dc_wallet;

import MyThead.LuckyNumberThread;
import form.WalletForm;

@Controller
public class AdminController {
	
	boolean flag = false;
	@Autowired
	JdbcTemplate template;
	
	@RequestMapping("/admin")
	public String admin() {
		//�ж��û��Ƿ��¼
		//��¼�ɹ�����ʾadminҳ��
		return "admin";
	}
	
	
	
	@RequestMapping("/lucky_on") 
	public String Lucky_on(String round) {
		LuckyNumberThread t = new LuckyNumberThread();
		t.setTemplate(template);
		int r = 0;
		try {
			r = Integer.parseInt(round);
		} catch (Exception e) {
			// TODO: handle exception
		}
		t.setRound(r);
				
		t.start();
		return "luckyon";
	}
	
	
}
