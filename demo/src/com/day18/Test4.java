package com.day18;

import java.awt.Color;
import java.awt.Frame;

//AWT(Abstract Windows ToolKit)-Swing-fx
//�̺�Ʈ ������ ���α׷��� �����ϱ� ���ؼ� ��� ����
public class Test4 extends Frame{
	
	private static final long serialVersionUID = 1L;

	public Test4() {
		
		setTitle("�ڹ� ������");
		setSize(200, 300);
		setBackground(new Color(255, 255, 0));
		setVisible(true);		
		
	}	
	
	public static void main(String[] args) {

		new Test4();
		
		
		
	}

}
