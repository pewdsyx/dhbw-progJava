package GUI.guiVotier.Taschenrechner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;



import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;




public class MyActionListener implements ActionListener{

	JTextPane output;
	
	public MyActionListener(JTextPane aTextPane) {
		output=aTextPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		switch(e.getSource().toString()) {
		
			case "1" :  setText("1"); break;
			
			case "2" :  setText("2"); break;
			
			case "3" :  setText("3"); break;
			
			case "4" :  setText("4"); break;
			
			case "5" :  setText("5"); break;
			
			case "6" :  setText("6"); break;
			
			case "7" :  setText("7"); break;
			
			case "8" :  setText("8"); break;
			
			case "9" :  setText("9"); break;
			
			case "0" :  setText("0"); break;
			
			case "+" :  setText("+"); break;
			
			case "-" :  setText("-"); break;
			
			case "*" :  setText("*"); break;
			
			case "/" :  setText("/"); break;
			
			case "=" : 	
				
				ScriptEngineManager mgr = new ScriptEngineManager();
			    ScriptEngine engine = mgr.getEngineByName("JavaScript");
			    String foo = output.getText();
			try {
				output.setText(engine.eval(foo)+"");
			} catch (ScriptException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} break;
			
			case "CE" :	output.setText(""); break;
				
					
		}
		
	}
	
	public void setText(String inp) {
		
		output.setText(output.getText()+inp);
	}
	
	
	
	
	
}
