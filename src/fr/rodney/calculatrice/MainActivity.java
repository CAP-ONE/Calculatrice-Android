package fr.rodney.calculatrice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Button button9, button8, button7,button6,button5,button4,button3,button2,button1,button0,buttonvirgule,buttonegal,buttonsup,buttondivision,buttondiviser,buttonmult,buttonsous,buttonsom;
	private EditText text, resultat;
	private String operateur,champ1;
	private boolean virgule = true,somme = true,mult = false, sous = true,diviser = false, initiateCalcul=false ;
	protected boolean initiateZero;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button9 = (Button) findViewById(R.id.button9);
		button8 = (Button) findViewById(R.id.button8);
		button7 = (Button) findViewById(R.id.button7);
		button6 = (Button) findViewById(R.id.button6);
		button5 = (Button) findViewById(R.id.button5);
		button4 = (Button) findViewById(R.id.button4);
		button3 = (Button) findViewById(R.id.button3);
		button2 = (Button) findViewById(R.id.button2);
		button1 = (Button) findViewById(R.id.button1);
		button0 = (Button) findViewById(R.id.button0);
		buttonvirgule = (Button) findViewById(R.id.buttonvirgule);
		buttonegal = (Button) findViewById(R.id.buttonegal);
		buttonsup = (Button) findViewById(R.id.supp);
		//buttondivision = (Button) findViewById(R.id.division);
		buttondiviser = (Button) findViewById(R.id.diviser);
		buttonmult = (Button) findViewById(R.id.mult);
		buttonsous = (Button) findViewById(R.id.sous);
		buttonsom = (Button) findViewById(R.id.somme);
		
		text = (EditText) findViewById(R.id.editText1);
		resultat = (EditText) findViewById(R.id.resultat);
		
		
		
		
		button9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("9");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		button8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("8");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("7");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("6");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("5");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("4");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("3");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("2");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("1");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		button0.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("0");
				somme=true;
				sous=true;
				mult=true;
				diviser=true;
				if(initiateCalcul) {
					champ1 = text.getText().toString();
					calc();
				}
			}
		});
		
		
		buttonsom.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(somme) {
					if(resultat.getText().length() > 0) text.setText(resultat.getText().toString()); resultat.getText().clear();
					
					if(text.getText().length() == 0) initiateZero = true;
					
					operateur = "+";
					initiateCalcul = true;
					
					text.append("+");
					sous = false;
					mult = false;
					somme=false;
					diviser=false;
					virgule=true;
				}
			}
		});
		
		buttondiviser.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(diviser) {
					if(resultat.getText().length() > 0) text.setText(resultat.getText().toString()); resultat.getText().clear();
					
					operateur = "/";
					initiateCalcul = true;
					
					text.append("/");
					sous = false;
					mult = false;
					somme=false;
					diviser=false;
					virgule=true;
				}
			}
		});
		
		buttonmult.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(mult) {
					if(resultat.getText().length() > 0) text.setText(resultat.getText().toString()); resultat.getText().clear();
					
					
					operateur = "x";
					initiateCalcul = true;
					
					text.append("x");
					sous = false;
					mult = false;
					somme=false;
					diviser=false;
					virgule=true;
				}
			}
		});
		
		buttonsous.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				if(sous) {
					if(resultat.getText().length() > 0) text.setText(resultat.getText().toString()); resultat.getText().clear();
					
					if(text.getText().length() == 0) initiateZero = true;
					
					operateur = "-";
					initiateCalcul = true;
					
					text.append("-");
					sous = false;
					mult = false;
					somme=false;
					diviser=false;
					virgule=true;
				}
			}
		});
		
		buttonsup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String textEdit = text.getText().toString();
				String textEditModif;
				if(textEdit.length() > 0) {
					text.setText(textEdit.substring(0,textEdit.length()-1));
					
					textEditModif = text.getText().toString();
					
					Log.d("SUP", "textEditModif: "+textEditModif);
					
					if(text.length()==0) {
						if(resultat.getText().length()>0) 
							resultat.getText().clear();
						initiateCalcul=false;
					}
					if(initiateCalcul) {
						champ1 = text.getText().toString();
						calc();
					}
					
					if(textEditModif.length() > 0) {
						if(!textEditModif.substring(textEditModif.length()-1).matches("[x+/-]|[\\.]")) {
							Log.d("SUP", "nomatches: "+textEditModif.substring(textEditModif.length()-1));
							somme=true;
							sous=true;
							mult=true;
							diviser=true;
							virgule=true;
						} else {
							Log.d("SUP", "we did it "+textEditModif.substring(textEditModif.length()-1));
							somme=false;
							sous=false;
							mult=false;
							diviser=false;
							virgule=false;
						}
					}
					
					
				}
				
				
						
			}
		});
		
		buttonsup.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				text.getText().clear();
				resultat.getText().clear();
				initiateCalcul = false;
				virgule = true;
				return true;
			}
		});
		
		buttonegal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(resultat.getText().length() > 0) text.setText(resultat.getText().toString()); resultat.getText().clear();
			}
		});
		
		
		buttonvirgule.setOnClickListener(new OnClickListener() {
			
			

			@Override
			public void onClick(View v) {
				if(virgule) {
					text.append(".");
					virgule = false;
				}
			}
		});

		
	}
	
	
	
	private void calc() {

		String[] calcul = null;
//		List<String> allOps = new ArrayList<String>();
//		 Matcher m = Pattern.compile("[x+/-]")
//		     .matcher(champ1);
//		 while (m.find()) {
//		   allOps.add(m.group());
//		 }
//		 int i=0;
//		 for(String op : allOps){			 
//			 Log.d("OPS", "operateur "+i+": "+op);
//			 i++;
//		 }
//		 
//		 if(initiateZero) {
//			 allOps.remove(0);
//			 initiateZero = false;
//		 }
//		
//		 switch(allOps.size()) {
//		 case 0 : Log.d("OPS", "nb ops: "+allOps.size());  break; //pas d'opérateur
//		 
//		 case 1 : // au moins un opérateur
//			 String operateur = allOps.get(0);

			 Log.d("SPLIT", "operateur: "+operateur);
			 //Log.d("OPS", "nb ops: "+allOps.size()); 
			 
			 if(operateur.equals("+")) calcul = champ1.split("\\"+operateur);
			 else calcul = champ1.split(operateur);
			 
				Log.d("CALCUL", "champ1: "+champ1);
				
				if(calcul.length > 1) {
					Log.d("CALCUL", "calcul length: "+calcul.length);
					Log.d("SPLIT", "chiffre1: "+calcul[0]+" chiffre2: "+calcul[1]);
					
					float chiffre1;
					if(calcul[0].equals("")) chiffre1 =0; 
					else chiffre1 = Float.parseFloat(calcul[0]);
					
					float chiffre2 = Float.parseFloat(calcul[1]);
					
					if(operateur.equals("+")) resultat.setText(""+(chiffre1+chiffre2));
					else if(operateur.equals("-")) resultat.setText(""+(chiffre1-chiffre2));
					else if(operateur.equals("/")) resultat.setText(""+(chiffre1/chiffre2));
					else if(operateur.equals("x")) resultat.setText(""+(chiffre1*chiffre2));
					
					
					
					Log.d("RESULTAT", "resultat: "+resultat.getText().toString());
				}
				else {
					Log.d("CALCUL", "calcul length: "+calcul.length);
						if(resultat.getText().length() > 0) resultat.getText().clear();
				}
//			break;
//		 
//		 default : 		
			 //Log.d("CALCUL", "multicalcul nb ops: "+allOps.size());// plusieurs opérateurs
//		 
//		 Log.d("CALCUL", "champ1: "+champ1);
//		 
////		 String[] priorityCalc = Pattern.compile("(\\d*)(\\B(\\D+)\\B(\\d*))")
////			     .split(champ1);
//		 
//		 
//		 String [] priorityCalc  = champ1.split("(.(\\d+)[+-])+");
//		 	
//		 	for(String calc : priorityCalc)
//		 	Log.d("MULTICALC", calc);
	
		 	
		 	 //break; 
		 
//		 }
	
	}

	
}
