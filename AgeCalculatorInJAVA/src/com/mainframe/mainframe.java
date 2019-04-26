package com.mainframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

public class mainframe extends JFrame{
	JLabel lbl_north,lbl_p_d,lbl_b_d,lbl_your_age,lbl_year,lbl_month,lbl_day;
	JTextField txt_p_d,txt_year,txt_month,txt_day;
	JDateChooser chooser;
	JButton btn_south;
	Font font=new Font("serif",Font.PLAIN,40);
	Font font1=new Font("serif",Font.PLAIN,20);
	JPanel panel;
	GridBagLayout gl;
	GridBagConstraints gr;
	public mainframe() {
		init();
		cmp();
	}
	public void init() {
		setSize(700,350);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Age Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void cmp() {
		lbl_initialization();
		txt_initialization();
		btn_initialization();
		layout_initialization();
		
		this.add(lbl_north,BorderLayout.NORTH);
		panel=new JPanel();
		this.add(panel,BorderLayout.CENTER);
		panel.setLayout(gl);
		p_c_work();
		this.add(btn_south,BorderLayout.SOUTH);
	}
	public void p_c_work() {
		GridBagLayoutWork(panel,lbl_p_d,5,5,5,5,0,0);
		GridBagLayoutWork(panel,txt_p_d,5,5,5,5,1,0);
		GridBagLayoutWork(panel,lbl_b_d,5,5,5,5,0,1);
		GridBagLayoutWork(panel,chooser,5,5,5,5,1,1);
		GridBagLayoutWork(panel,lbl_your_age,5,5,5,5,0,2);
		GridBagLayoutWork(panel,txt_year,5,5,5,5,0,3);
		GridBagLayoutWork(panel,txt_month,5,5,5,5,1,3);
		GridBagLayoutWork(panel,txt_day,5,5,5,5,2,3);
		GridBagLayoutWork(panel,lbl_year,5,5,5,5,0,4);
		GridBagLayoutWork(panel,lbl_month,5,5,5,5,1,4);
		GridBagLayoutWork(panel,lbl_day,5,5,5,5,2,4);
	}
	public void GridBagLayoutWork(JPanel panel,JComponent component,int p,int q,int r,int s,int x,int y) {
		gr.gridx=x;
		gr.gridy=y;
		gr.insets=new Insets(5, 5, 5, 5);
		panel.add(component,gr);
	}
	public void layout_initialization() {
		gl=new GridBagLayout();
		gr=new GridBagConstraints();
	}
	public void lbl_initialization() {
		lbl_north=new JLabel("Age Calculator");
		lbl_north.setFont(font);
		lbl_north.setForeground(Color.RED);
		lbl_north.setHorizontalAlignment(SwingConstants.CENTER);
		
		lbl_p_d=new JLabel("Present Date");
		lbl_p_d.setFont(font1);
		
		lbl_b_d=new JLabel("Born Date");
		lbl_b_d.setFont(font1);
		
		lbl_your_age=new JLabel("Your Age Is");
		lbl_your_age.setForeground(Color.RED);
		lbl_your_age.setFont(font1);
		
		lbl_year=new JLabel("Year");
		lbl_year.setFont(font1);
		
		lbl_month=new JLabel("Month");
		lbl_month.setFont(font1);
		
		lbl_day=new JLabel("Day");
		lbl_day.setFont(font1);
	}
	public void txt_initialization() {
		txt_p_d=new JTextField();
		txt_p_d.setPreferredSize(new Dimension(160, 35));
		txt_p_d.setFont(font1);
		
		txt_year=new JTextField();
		txt_year.setPreferredSize(new Dimension(160, 35));
		txt_year.setFont(font1);
		
		txt_month=new JTextField();
		txt_month.setPreferredSize(new Dimension(160, 35));
		txt_month.setFont(font1);
		
		txt_day=new JTextField();
		txt_day.setPreferredSize(new Dimension(160, 35));
		txt_day.setFont(font1);
		
		chooser=new JDateChooser();
		chooser.setPreferredSize(new Dimension(160, 35));
		chooser.setFont(font1);
	}
	public void btn_initialization() {
		btn_south=new JButton("Age Calculate");
		btn_south.setFont(font1);
	}
}
