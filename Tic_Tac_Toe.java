/*
 * AUTHOR - ROHIT KUMAR (2015078)
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Tic_Tac_Toe implements ActionListener{
	public static int start1,start2,start3,start4;
	public void nextPage(){
		class Grid{
			Grid(){}
			JButton b1 = new JButton();
			JButton b2 = new JButton();
			JButton b3 = new JButton();
			JButton b4 = new JButton();
			JButton b5 = new JButton();
			JButton b6 = new JButton();
			JButton b7 = new JButton();
			JButton b8 = new JButton();
			JButton b9 = new JButton();
			
			private void factorial()
			{
				int fact=1;
				for(int i=1;i<=1000000000;i++)
				{
					 fact = fact * i;
				}
			}
			private int checkWin(){
				if(b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "X"){
					b1.setBackground(Color.RED);
					b2.setBackground(Color.RED);
					b3.setBackground(Color.RED);
					return 1; 
				}
				else if(b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "X"){
					b4.setBackground(Color.RED);
					b5.setBackground(Color.RED);
					b6.setBackground(Color.RED);
					return 1; 
				}
				else if(b7.getText() == "X" && b8.getText() == "X" && b9.getText() == "X"){
					b7.setBackground(Color.RED);
					b8.setBackground(Color.RED);
					b9.setBackground(Color.RED);
					return 1; 
				}
				else if(b1.getText() == "X" && b4.getText() == "X" && b7.getText() == "X"){
					b1.setBackground(Color.RED);
					b4.setBackground(Color.RED);
					b7.setBackground(Color.RED);
					return 1; 
				}
				else if(b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "X"){
					b2.setBackground(Color.RED);
					b5.setBackground(Color.RED);
					b8.setBackground(Color.RED);
					return 1; 
				}
				else if(b3.getText() == "X" && b6.getText() == "X" && b9.getText() == "X"){
					b3.setBackground(Color.RED);
					b6.setBackground(Color.RED);
					b9.setBackground(Color.RED);
					return 1; 
				}
				else if(b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "X"){
					b1.setBackground(Color.RED);
					b5.setBackground(Color.RED);
					b9.setBackground(Color.RED);
					return 1; 
				}
				else if(b3.getText() == "X" && b5.getText() == "X" && b7.getText() == "X"){
					b3.setBackground(Color.RED);
					b5.setBackground(Color.RED);
					b7.setBackground(Color.RED);
					return 1; 
				}
				
				if(b1.getText() == "O" && b2.getText() == "O" && b3.getText() == "O"){
					b1.setBackground(Color.GREEN);
					b2.setBackground(Color.GREEN);
					b3.setBackground(Color.GREEN);
					return 2; 
				}
				else if(b4.getText() == "O" && b5.getText() == "O" && b6.getText() == "O"){
					b4.setBackground(Color.GREEN);
					b5.setBackground(Color.GREEN);
					b6.setBackground(Color.GREEN);
					return 2; 
				}
				else if(b7.getText() == "O" && b8.getText() == "O" && b9.getText() == "O"){
					b7.setBackground(Color.GREEN);
					b8.setBackground(Color.GREEN);
					b9.setBackground(Color.GREEN);
					return 2; 
				}
				else if(b1.getText() == "O" && b4.getText() == "O" && b7.getText() == "O"){
					b1.setBackground(Color.GREEN);
					b4.setBackground(Color.GREEN);
					b7.setBackground(Color.GREEN);
					return 2; 
				}
				else if(b2.getText() == "O" && b5.getText() == "O" && b8.getText() == "O"){
					b2.setBackground(Color.GREEN);
					b5.setBackground(Color.GREEN);
					b8.setBackground(Color.GREEN);
					return 2; 
				}
				else if(b3.getText() == "O" && b6.getText() == "O" && b9.getText() == "O"){
					b3.setBackground(Color.GREEN);
					b6.setBackground(Color.GREEN);
					b9.setBackground(Color.GREEN);
					return 2; 
				}
				else if(b1.getText() == "O" && b5.getText() == "O" && b9.getText() == "O"){
					b1.setBackground(Color.GREEN);
					b5.setBackground(Color.GREEN);
					b9.setBackground(Color.GREEN);
					return 2; 
				}
				else if(b3.getText() == "O" && b5.getText() == "O" && b7.getText() == "O"){
					b3.setBackground(Color.GREEN);
					b5.setBackground(Color.GREEN);
					b7.setBackground(Color.GREEN);
					return 2; 
				}
				
				int count = 0;
				if(b1.getText() == "")
					count++;
				if(b2.getText() == "")
					count++;
				if(b3.getText() == "")
					count++;
				if(b4.getText() == "")
					count++;
				if(b5.getText() == "")
					count++;
				if(b6.getText() == "")
					count++;
				if(b7.getText() == "")
					count++;
				if(b8.getText() == "")
					count++;
				if(b9.getText() == "")
					count++;
				
				if(count == 0)
					return 3;
				
				return 0;
			}
			private int adjacentButton(){
				if(b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "")
					return 3;
				if(b1.getText() == "X" && b3.getText() == "X"  && b2.getText() == "")
					return 2;
				if(b2.getText() == "X" && b3.getText() == "X"  && b1.getText() == "")
					return 1;
				if(b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "")
					return 6;
				if(b4.getText() == "X" && b6.getText() == "X" && b5.getText() == "")
					return 5;
				if(b5.getText() == "X" && b6.getText() == "X" && b4.getText() == "")
					return 4;
				if(b7.getText() == "X" && b8.getText() == "X" && b9.getText() == "")
					return 9;
				if(b7.getText() == "X" && b9.getText() == "X" && b8.getText() == "")
					return 8;
				if(b8.getText() == "X" && b9.getText() == "X" && b7.getText() == "")
					return 7;
				
				if(b1.getText() == "X" && b4.getText() == "X" && b7.getText() == "")
					return 7;
				if(b1.getText() == "X" && b7.getText() == "X" && b4.getText() == "")
					return 4;
				if(b4.getText() == "X" && b7.getText() == "X" && b1.getText() == "")
					return 1;
				if(b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "")
					return 8;
				if(b2.getText() == "X" && b8.getText() == "X" && b5.getText() == "")
					return 5;
				if(b5.getText() == "X" && b8.getText() == "X" && b2.getText() == "")
					return 2;
				if(b3.getText() == "X" && b6.getText() == "X" && b9.getText() == "")
					return 9;
				if(b3.getText() == "X" && b9.getText() == "X" && b6.getText() == "")
					return 6;
				if(b6.getText() == "X" && b9.getText() == "X" && b3.getText() == "")
					return 3;
				if(b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "")
					return 9;
				if(b1.getText() == "X" && b9.getText() == "X" && b5.getText() == "")
					return 5;
				if(b5.getText() == "X" && b9.getText() == "X" && b1.getText() == "")
					return 1;
				if(b3.getText() == "X" && b5.getText() == "X" && b7.getText() == "")
					return 7;
				if(b3.getText() == "X" && b7.getText() == "X" && b5.getText() == "")
					return 5;
				if(b5.getText() == "X" && b7.getText() == "X" && b3.getText() == "")
					return 3;
				else
					return 0;
			}
			private void setBackgroundWhite(){
				b1.setBackground(Color.WHITE);
				b2.setBackground(Color.WHITE);
				b3.setBackground(Color.WHITE);
				b4.setBackground(Color.WHITE);
				b5.setBackground(Color.WHITE);
				b6.setBackground(Color.WHITE);
				b7.setBackground(Color.WHITE);
				b8.setBackground(Color.WHITE);
				b9.setBackground(Color.WHITE);
			}
			
			private void createGrid(){
				JFrame newFrame = new JFrame();
				newFrame.setTitle("Tic-Tac-Toe");
				newFrame.setSize(550, 550);
				
				b1.setBounds(200, 50, 100, 100);
				b2.setBounds(300, 50, 100, 100);
				b3.setBounds(400, 50, 100, 100);
				b4.setBounds(200, 150, 100, 100);
				b5.setBounds(300, 150, 100, 100);
				b6.setBounds(400, 150, 100, 100);
				b7.setBounds(200, 250, 100, 100);
				b8.setBounds(300, 250, 100, 100);
				b9.setBounds(400, 250, 100, 100);
				
				TextField output = new TextField();
				output.setBounds(200, 420, 300, 40);

				Tic_Tac_Toe.start1 = 0;
				
				
				JButton user1VSuser2 = new JButton("<html><span style='font-size:10px'>"+"User1 VS User2"+"</span></html>");
				user1VSuser2.setBounds(20, 20, 150, 50);
				
				user1VSuser2.addActionListener( new ActionListener(){
					public void actionPerformed(ActionEvent e){
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						
						setBackgroundWhite();
						Object source = e.getSource();
						if (source instanceof Component) {
							((Component)source).setBackground(Color.BLUE);
						}
						JTextField u1Field = new JTextField(5);
						JTextField u2Field = new JTextField(5);

						JPanel myPanel = new JPanel();
						myPanel.add(new JLabel("User1 : "));
						myPanel.add(u1Field);
						myPanel.add(Box.createHorizontalStrut(15)); // a spacer
						myPanel.add(new JLabel("User2 : "));
						myPanel.add(u2Field);

						int result = JOptionPane.showConfirmDialog(null, myPanel, 
								"Please Enter User1 and User2 name", JOptionPane.OK_CANCEL_OPTION);
						if (result == JOptionPane.OK_OPTION) {
							output.setText("User1 is : " + u1Field.getText() + " and User2 is : " + u2Field.getText());
						}
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						Random rand = new Random();
						Tic_Tac_Toe.start1 = rand.nextInt(2) + 1;
						turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
						int choice = 1;
						b1.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button1ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(u1Field.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText(u2Field.getText() + " Win's");
								else{
									turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b2.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button2ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(u1Field.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText(u2Field.getText() + " Win's");
								else{
									turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b3.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button3ActionPerformed(e,choice); 
								if(checkWin() == 1)
									output.setText(u1Field.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText(u2Field.getText() + " Win's");
								else{
									turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b4.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button4ActionPerformed(e,choice); 
								if(checkWin() == 1)
									output.setText(u1Field.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText(u2Field.getText() + " Win's");
								else{
									turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b5.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button5ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(u1Field.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText(u2Field.getText() + " Win's");
								else{
									turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b6.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button6ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(u1Field.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText(u2Field.getText() + " Win's");
								else{
									turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b7.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button7ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(u1Field.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText(u2Field.getText() + " Win's");
								else{
									turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b8.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button8ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(u1Field.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText(u2Field.getText() + " Win's");
								else{
									turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b9.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button9ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(u1Field.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText(u2Field.getText() + " Win's");
								else{
									turn(Tic_Tac_Toe.start1, output, u1Field, u2Field);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
					}
				});
				
				Tic_Tac_Toe.start2 = 0;
				JButton userVScpu = new JButton("<html><span style='font-size:10px'>"+"User VS CPU"+"</span></html>");
				userVScpu.setBounds(20, 80, 150, 50);
				
				userVScpu.addActionListener( new ActionListener(){
					public void actionPerformed(ActionEvent e){
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						
						setBackgroundWhite();
						Object source = e.getSource();
						if (source instanceof Component) {
							((Component)source).setBackground(Color.BLUE);
						}
						JTextField uField = new JTextField(5);
						JPanel myPanel = new JPanel();
						myPanel.add(new JLabel("User : "));
						myPanel.add(uField);
						myPanel.add(Box.createHorizontalStrut(15)); // a spacer

						int result = JOptionPane.showConfirmDialog(null, myPanel, 
								"Please Enter User name ", JOptionPane.OK_CANCEL_OPTION);
						if (result == JOptionPane.OK_OPTION) {
							output.setText("User is : " + uField.getText());
						}
//						try {
//							Thread.sleep(2000);
//						} catch (InterruptedException e1) {
//							e1.printStackTrace();
//						}
						Tic_Tac_Toe.start2 = 1;
						turnC(Tic_Tac_Toe.start2, output, uField);
						int choice = 2;
						b1.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button1ActionPerformed(e, choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("CPU" + " Win's");
								else if(checkWin() == 3)
									output.setText("It's a Tie");
								else{
									Tic_Tac_Toe.start2 = 1;
									turnC(Tic_Tac_Toe.start2, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b2.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button2ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("CPU" + " Win's");
								else if(checkWin() == 3)
									output.setText("It's a Tie");
								else{
									Tic_Tac_Toe.start2 = 1;
									turnC(Tic_Tac_Toe.start2, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b3.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button3ActionPerformed(e,choice); 
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("CPU" + " Win's");
								else if(checkWin() == 3)
									output.setText("It's a Tie");
								else{
									Tic_Tac_Toe.start2 = 1;
									turnC(Tic_Tac_Toe.start2, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b4.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button4ActionPerformed(e,choice); 
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("CPU" + " Win's");
								else if(checkWin() == 3)
									output.setText("It's a Tie");
								else{
									Tic_Tac_Toe.start2 = 1;
									turnC(Tic_Tac_Toe.start2, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b5.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button5ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("CPU" + " Win's");
								else if(checkWin() == 3)
									output.setText("It's a Tie");
								else{
									Tic_Tac_Toe.start2 = 1;
									turnC(Tic_Tac_Toe.start2, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b6.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button6ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("CPU" + " Win's");
								else if(checkWin() == 3)
									output.setText("It's a Tie");
								else{
									Tic_Tac_Toe.start2 = 1;
									turnC(Tic_Tac_Toe.start2, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b7.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button7ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("CPU" + " Win's");
								else if(checkWin() == 3)
									output.setText("It's a Tie");
								else{
									Tic_Tac_Toe.start2 = 1;
									turnC(Tic_Tac_Toe.start2, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b8.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button8ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("CPU" + " Win's");
								else if(checkWin() == 3)
									output.setText("It's a Tie");
								else{
									Tic_Tac_Toe.start2 = 1;
									turnC(Tic_Tac_Toe.start2, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b9.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button9ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("CPU" + " Win's");
								else if(checkWin() == 3)
									output.setText("It's a Tie");
								else{
									Tic_Tac_Toe.start2 = 1;
									turnC(Tic_Tac_Toe.start2, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
					}
				});
				Tic_Tac_Toe.start3 = 0;
				JButton cpuVSai = new JButton("<html><span style='font-size:10px'>"+"CPU VS AI Bot"+"</span></html>");
				cpuVSai.setBounds(20, 140, 150, 50);
				
				cpuVSai.addActionListener( new ActionListener(){
					public void actionPerformed(ActionEvent e){
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						
						setBackgroundWhite();
						Object source = e.getSource();
						if (source instanceof Component) {
							((Component)source).setBackground(Color.BLUE);
						}
						output.setText(null);
						//Tic_Tac_Toe.startFirst = 1;
						Random rand1 = new Random();
						Tic_Tac_Toe.start3 = rand1.nextInt(2) + 1;
						turnCA(Tic_Tac_Toe.start3, output);
						while(true){
							if(Tic_Tac_Toe.start3 == 1){
								Random rand = new Random();
								while(true){
									int button = rand.nextInt(9) + 1;
									if(button == 1){	
										if(b1.getText() == ""){
											b1.setText("X");
											break;
										}
									}
									else if(button == 2){
										if(b2.getText() == ""){
											b2.setText("X");
											break;
										}
									}
									else if(button == 3){
										if(b3.getText() == ""){
											b3.setText("X");
											break;
										}
									}
									else if(button == 4){
										if(b4.getText() == ""){
											b4.setText("X");
											break;
										}
									}
									else if(button == 5){
										if(b5.getText() == ""){
											b5.setText("X");
											break;
										}
									}
									else if(button == 6){
										if(b6.getText() == ""){
											b6.setText("X");
											break;
										}
									}
									else if(button == 7){
										if(b7.getText() == ""){
											b7.setText("X");
											break;
										}
									}
									else if(button == 8){
										if(b8.getText() == ""){
											b8.setText("X");
											break;
										}
									}
									else if(button == 9){
										if(b9.getText() == ""){
											b9.setText("X");
											break;
										}
									}
								}
							}
							if(checkWin() != 3){
								int twoButton = adjacentButton();
								if(twoButton == 1){
									if(b1.getText() == ""){
										b1.setText("O");
									}
								}
								else if(twoButton == 3){
									if(b3.getText() == ""){
										b3.setText("O");
									}
								}
								else if(twoButton == 5){
									if(b5.getText() == ""){
										b5.setText("O");
									}
								}
								else if(twoButton == 7){
									if(b7.getText() == ""){
										b7.setText("O");
									}
								}
								else if(twoButton == 9){
									if(b9.getText() == ""){
										b9.setText("O");
									}
								}	
								else if(twoButton == 0){
									if(Tic_Tac_Toe.start3 == 2){
										if(b1.getText() == "X"){
											if(b2.getText() == "")
												b2.setText("O");
											else if(b5.getText() == "")
												b5.setText("O");
											else{
												while(true){
													if(checkWin() == 3){
														break;
													}
													Random rand = new Random();
													int button = rand.nextInt(9) + 1;
													if(button == 3){
														if(b3.getText() == ""){
															b3.setText("O");
															break;
														}
													}
													else if(button == 4){
														if(b4.getText() == ""){
															b4.setText("O");
															break;
														}
													}
													else if(button == 6){
														if(b6.getText() == ""){
															b6.setText("O");
															break;
														}
													}
													else if(button == 7){
														if(b7.getText() == ""){
															b7.setText("O");
															break;
														}
													}
													else if(button == 8){
														if(b8.getText() == ""){
															b8.setText("O");
															break;
														}
													}
													else if(button == 9){
														if(b9.getText() == ""){
															b9.setText("O");
															break;
														}
													}
												}
											}
										}
										else if(b2.getText() == "X"){
											if(b5.getText() == ""){
												b5.setText("O");
											}
											else{
												while(true){
													if(checkWin() == 3){
														break;
													}
													Random rand = new Random();
													int button = rand.nextInt(9) + 1;
													if(button == 1){	
														if(b1.getText() == ""){
															b1.setText("O");
															break;
														}
													}
													else if(button == 3){
														if(b3.getText() == ""){
															b3.setText("O");
															break;
														}
													}
													else if(button == 4){
														if(b4.getText() == ""){
															b4.setText("O");
															break;
														}
													}
													else if(button == 6){
														if(b6.getText() == ""){
															b6.setText("O");
															break;
														}
													}
													else if(button == 7){
														if(b7.getText() == ""){
															b7.setText("O");
															break;
														}
													}
													else if(button == 8){
														if(b8.getText() == ""){
															b8.setText("O");
															break;
														}
													}
													else if(button == 9){
														if(b9.getText() == ""){
															b9.setText("O");
															break;
														}
													}
												}
											}
										}
										else if(b3.getText() == "X"){
											if(b2.getText() == ""){
												b2.setText("O");
											}
											else if(b5.getText() == ""){
												b5.setText("O");
											}
											else{
												while(true){
													if(checkWin() == 3){
														break;
													}
													Random rand = new Random();
													int button = rand.nextInt(9) + 1;
													if(button == 1){	
														if(b1.getText() == ""){
															b1.setText("O");
															break;
														}
													}
													else if(button == 4){
														if(b4.getText() == ""){
															b4.setText("O");
															break;
														}
													}
													else if(button == 6){
														if(b6.getText() == ""){
															b6.setText("O");
															break;
														}
													}
													else if(button == 7){
														if(b7.getText() == ""){
															b7.setText("O");
															break;
														}
													}
													else if(button == 8){
														if(b8.getText() == ""){
															b8.setText("O");
															break;
														}
													}
													else if(button == 9){
														if(b9.getText() == ""){
															b9.setText("O");
															break;
														}
													}
												}
											}
										}
										else if(b4.getText() == "X")
										{
											if(b5.getText() == "")
											{
												b5.setText("O");
											}
											else{
												while(true){
													if(checkWin() == 3){
														break;
													}
													Random rand = new Random();
													int button = rand.nextInt(9) + 1;
													if(button == 1){	
														if(b1.getText() == ""){
															b1.setText("O");
															break;
														}
													}
													if(button == 2){
														if(b2.getText() == ""){
															b2.setText("O");
															break;
														}
													}
													else if(button == 3){
														if(b3.getText() == ""){
															b3.setText("O");
															break;
														}
													}
													else if(button == 6){
														if(b6.getText() == ""){
															b6.setText("O");
															break;
														}
													}
													else if(button == 7){
														if(b7.getText() == ""){
															b7.setText("O");
															break;
														}
													}
													else if(button == 8){
														if(b8.getText() == ""){
															b8.setText("O");
															break;
														}
													}
													else if(button == 9){
														if(b9.getText() == ""){
															b9.setText("O");
															break;
														}
													}
												}
											}
										}
										else if(b5.getText() == "X")
										{
											if(b2.getText() == ""){
												b2.setText("O");
											}
											else if(b8.getText() == ""){
												b8.setText("O");
											}
										}
										else if(b6.getText() == "X"){
											if(b5.getText() == ""){
												b5.setText("O");
											}
											else{
												while(true){
													if(checkWin() == 3){
														break;
													}
													Random rand = new Random();
													int button = rand.nextInt(9) + 1;
													if(button == 1){	
														if(b1.getText() == ""){
															b1.setText("O");
															break;
														}
													}
													else if(button == 2){
														if(b2.getText() == ""){
															b2.setText("O");
															break;
														}
													}
													else if(button == 3){
														if(b3.getText() == ""){
															b3.setText("O");
															break;
														}
													}
													else if(button == 4){
														if(b4.getText() == ""){
															b4.setText("O");
															break;
														}
													}
													else if(button == 7){
														if(b7.getText() == ""){
															b7.setText("O");
															break;
														}
													}
													else if(button == 8){
														if(b8.getText() == ""){
															b8.setText("O");
															break;
														}
													}
													else if(button == 9){
														if(b9.getText() == ""){
															b9.setText("O");
															break;
														}
													}
												}
											}
										}
										else if(b7.getText() == "X"){
											if(b8.getText() == ""){
												b8.setText("O");
											}
											else if(b5.getText() == ""){
												b5.setText("O");
											}
											else{
												while(true){
													if(checkWin() == 3){
														break;
													}
													Random rand = new Random();
													int button = rand.nextInt(9) + 1;
													if(button == 1){	
														if(b1.getText() == ""){
															b1.setText("O");
															break;
														}
													}
													else if(button == 2){
														if(b2.getText() == ""){
															b2.setText("O");
															break;
														}
													}
													else if(button == 3){
														if(b3.getText() == ""){
															b3.setText("O");
															break;
														}
													}
													else if(button == 4){
														if(b4.getText() == ""){
															b4.setText("O");
															break;
														}
													}
													else if(button == 6){
														if(b6.getText() == ""){
															b6.setText("O");
															break;
														}
													}
													else if(button == 9){
														if(b9.getText() == ""){
															b9.setText("O");
															break;
														}
													}
												}
											}
										}
										else if(b8.getText() == "X"){
											if(b5.getText() == ""){
												b5.setText("O");
											}
											else{
												while(true){
													if(checkWin() == 3){
														break;
													}
													Random rand = new Random();
													int button = rand.nextInt(9) + 1;
													if(button == 1){	
														if(b1.getText() == ""){
															b1.setText("O");
															break;
														}
													}
													else if(button == 2){
														if(b2.getText() == ""){
															b2.setText("O");
															break;
														}
													}
													else if(button == 3){
														if(b3.getText() == ""){
															b3.setText("O");
															break;
														}
													}
													else if(button == 4){
														if(b4.getText() == ""){
															b4.setText("O");
															break;
														}
													}
													else if(button == 6){
														if(b6.getText() == ""){
															b6.setText("O");
															break;
														}
													}
													else if(button == 7){
														if(b7.getText() == ""){
															b7.setText("O");
															break;
														}
													}
													else if(button == 9){
														if(b9.getText() == ""){
															b9.setText("O");
															break;
														}
													}
												}
											}
										}
										else if(b9.getText() == "X"){
											if(b8.getText() == ""){
												b8.setText("O");
											}
											else if(b5.getText() == ""){
												b5.setText("O");
											}
											else{
												while(true){
													if(checkWin() == 3){
														break;
													}
													Random rand = new Random();
													int button = rand.nextInt(9) + 1;
													if(button == 1){	
														if(b1.getText() == ""){
															b1.setText("O");
															break;
														}
													}
													else if(button == 2){
														if(b2.getText() == ""){
															b2.setText("O");
															break;
														}
													}
													else if(button == 3){
														if(b3.getText() == ""){
															b3.setText("O");
															break;
														}
													}
													else if(button == 4){
														if(b4.getText() == ""){
															b4.setText("O");
															break;
														}
													}
													else if(button == 6){
														if(b6.getText() == ""){
															b6.setText("O");
															break;
														}
													}
													else if(button == 7){
														if(b7.getText() == ""){
															b7.setText("O");
															break;
														}
													}
												}
											}
										}
									}
								}
							}
							if(Tic_Tac_Toe.start3 == 1)
								Tic_Tac_Toe.start3 = 2;
							else
								Tic_Tac_Toe.start3 = 1;
							if(checkWin() == 1){
								output.setText("CPU" + " Win's");
								break;
							}
							else if(checkWin() == 2){
								output.setText("AI" + " Win's");
								break;
							}
							else
							{
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								//timer.start();
								//factorial();
								turnCA(Tic_Tac_Toe.start3, output);
								
								if(checkWin() == 3){
									output.setText("It's a Tie");
									break;
								}
							}	
						}
					}		
				});
				
				Tic_Tac_Toe.start4 = 0;
				JButton userVSai = new JButton("<html><span style='font-size:10px'>"+"User VS AI Bot"+"</span></html>");
				userVSai.setBounds(20, 200, 150, 50);
				
				userVSai.addActionListener( new ActionListener(){
					public void actionPerformed(ActionEvent e){
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						
						setBackgroundWhite();
						Object source = e.getSource();
						if (source instanceof Component) {
							((Component)source).setBackground(Color.BLUE);
						}
						JTextField uField = new JTextField(5);

						JPanel myPanel = new JPanel();
						myPanel.add(new JLabel("User : "));
						myPanel.add(uField);
						myPanel.add(Box.createHorizontalStrut(15)); // a spacer

						int result = JOptionPane.showConfirmDialog(null, myPanel, 
								"Please Enter User name ", JOptionPane.OK_CANCEL_OPTION);
						if (result == JOptionPane.OK_OPTION) {
							output.setText("User is : " + uField.getText());
						}
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						Tic_Tac_Toe.start4 = 1;
						turnA(Tic_Tac_Toe.start4, output, uField);
						int choice = 4;
						b1.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button1ActionPerformed(e, choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("AI" + " Win's");
								else{
									turnA(Tic_Tac_Toe.start4, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b2.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button2ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("AI" + " Win's");
								else{
									turnA(Tic_Tac_Toe.start4, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b3.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button3ActionPerformed(e,choice); 
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("AI" + " Win's");
								else{
									turnA(Tic_Tac_Toe.start4, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b4.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button4ActionPerformed(e,choice); 
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("AI" + " Win's");
								else{
									turnA(Tic_Tac_Toe.start4, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b5.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button5ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("AI" + " Win's");
								else{
									turnA(Tic_Tac_Toe.start4, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b6.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button6ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("AI" + " Win's");
								else{
									turnA(Tic_Tac_Toe.start4, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b7.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button7ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("AI" + " Win's");
								else{
									turnA(Tic_Tac_Toe.start4, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b8.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button8ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("AI" + " Win's");
								else{
									turnA(Tic_Tac_Toe.start4, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
						b9.addActionListener( new ActionListener(){
							public void actionPerformed(ActionEvent e){
								button9ActionPerformed(e,choice);
								if(checkWin() == 1)
									output.setText(uField.getText() + " Win's");
								else if(checkWin() == 2)
									output.setText("AI" + " Win's");
								else{
									turnA(Tic_Tac_Toe.start4, output, uField);
									if(checkWin() == 3)
										output.setText("It's a Tie");
								}
							}
						});
					}
				});
							
				JButton exit = new JButton("<html><span style='font-size:10px'>"+"EXIT"+"</span></html>");
				exit.setBounds(20, 300, 150, 50);
				exit.addActionListener( new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						System.exit(0);
					}
				});
				
				newFrame.add(user1VSuser2);
				newFrame.add(userVScpu);
				newFrame.add(cpuVSai);
				newFrame.add(userVSai);
				newFrame.add(exit);
				newFrame.add(b1);
				newFrame.add(b2);
				newFrame.add(b3);
				newFrame.add(b4);
				newFrame.add(b5);
				newFrame.add(b6);
				newFrame.add(b7);
				newFrame.add(b8);
				newFrame.add(b9);

				newFrame.add(output);
				newFrame.setLayout(null);
				newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				newFrame.setVisible(true);
			}
			
			private void turn(int first, TextField output, JTextField u1Field, JTextField u2Field){
				if(first == 1)
					output.setText(u1Field.getText()+" turn's");
				else
					output.setText(u2Field.getText()+" turn's");
			}
			private void turnC(int first, TextField output, JTextField uField){
				if(first == 1)
					output.setText(uField.getText()+" turn's");
//				else if(first == 2)
//					output.setText("CPU"+" turn's");
			}
			private void turnA(int first, TextField output, JTextField uField){
				if(first == 1)
					output.setText(uField.getText()+" turn's");
				else
					output.setText("AI"+" turn's");
			}
			private void turnCA(int first, TextField output){
				if(first == 1)
					output.setText("CPU" + " turn's");
				else if(first == 2)
					output.setText("AI" + " turn's");
			}
			
			private void button1ActionPerformed(ActionEvent e, int choice) {
				if(choice == 1){
					if(b1.getText() == ""){
						if(Tic_Tac_Toe.start1 == 1)
							b1.setText("X");
						else
							b1.setText("O");
						if(Tic_Tac_Toe.start1 == 1)
							Tic_Tac_Toe.start1 = 2;
						else
							Tic_Tac_Toe.start1 = 1;
					}
				}
				else if(choice == 2){
					Tic_Tac_Toe.start2 = 1;
					if(b1.getText() == ""){
						if(Tic_Tac_Toe.start2 == 1)
							b1.setText("X");
					}
					Random rand = new Random();
					int box = rand.nextInt(9) + 1;
					while(true){
						if(box == 2){
							if(b2.getText() == ""){
								b2.setText("O");
								break;
							}
						}
						else if(box == 3){
							if(b3.getText() == ""){
								b3.setText("O");
								break;
							}
						}
						else if(box == 4){
							if(b4.getText() == ""){
								b4.setText("O");
								break;
							}
						}
						else if(box == 5){
							if(b5.getText() == ""){
								b5.setText("O");
								break;
							}
						}
						else if(box == 6){
							if(b6.getText() == ""){
								b6.setText("O");
								break;
							}
							
						}
						else if(box == 7){
							if(b7.getText() == ""){
								b7.setText("O");
								break;
							}
						}
						else if(box == 8){
							if(b8.getText() == ""){
								b8.setText("O");
								break;
							}
						}
						else if(box == 9){
							if(b9.getText() == ""){
								b9.setText("O");
								break;
							}
						}
						else if(b2.getText() != "" && b3.getText() != "" && b4.getText() != "" && b5.getText() != "" && b6.getText() != "" && b7.getText() != "" && b8.getText() != "" && b9.getText() != "")
							break;
							
						box = rand.nextInt(9) + 1;
					}
				}
				else if(choice == 4){
					Tic_Tac_Toe.start4 = 1;
					if(b1.getText() == ""){
						if(Tic_Tac_Toe.start4 == 1)
							b1.setText("X");
						else
							b1.setText("O");
						if(Tic_Tac_Toe.start4 == 1)
							Tic_Tac_Toe.start4 = 2;
						else
							Tic_Tac_Toe.start4 = 1;
					}
					if(checkWin() != 3){
						int twoButton = adjacentButton();
						if(twoButton == 1){
							if(b1.getText() == ""){
								b1.setText("O");
							}
						}
						else if(twoButton == 2){
							if(b2.getText() == ""){
								b2.setText("O");
							}
						}
						else if(twoButton == 3){
							if(b3.getText() == ""){
								b3.setText("O");
							}
						}
						else if(twoButton == 4){
							if(b4.getText() == ""){
								b4.setText("O");
							}
						}
						else if(twoButton == 5){
							if(b5.getText() == ""){
								b5.setText("O");
							}
						}
						else if(twoButton == 6){
							if(b6.getText() == ""){
								b6.setText("O");
							}
						}
						else if(twoButton == 7){
							if(b7.getText() == ""){
								b7.setText("O");
							}
						}
						else if(twoButton == 8){
							if(b8.getText() == ""){
								b8.setText("O");
							}
						}
						else if(twoButton == 9){
							if(b9.getText() == ""){
								b9.setText("O");
							}
						}
						else if(twoButton == 0){
							if(Tic_Tac_Toe.start4 == 2){	
								if(b1.getText() == "X"){
									if(b2.getText() == "")
										b2.setText("O");

									else if(b4.getText() == "")
										b4.setText("O");

									else if(b5.getText() == "")
										b5.setText("O");
									else{
										while(true){
											if(checkWin() == 3){
												break;
											}
											Random rand = new Random();
											int button = rand.nextInt(9) + 1;

											if(button == 1){
												if(b1.getText() == ""){
													b1.setText("O");
													break;
												}
											}
											else if(button == 2){
												if(b2.getText() == ""){
													b2.setText("O");
													break;
												}
											}

											else if(button == 3){
												if(b3.getText() == ""){
													b3.setText("O");
													break;
												}
											}
											else if(button == 4){
												if(b4.getText() == ""){
													b4.setText("O");
													break;
												}
											}

											else if(button == 5){
												if(b5.getText() == ""){
													b5.setText("O");
													break;
												}
											}

											else if(button == 6){
												if(b6.getText() == ""){
													b6.setText("O");
													break;
												}
											}
											else if(button == 7){
												if(b7.getText() == ""){
													b7.setText("O");
													break;
												}
											}
											else if(button == 8){
												if(b8.getText() == ""){
													b8.setText("O");
													break;
												}
											}
											else if(button == 9){
												if(b9.getText() == ""){
													b9.setText("O");
													break;
												}
											}
										}
									}
								}
							}
						}
					}
					if(Tic_Tac_Toe.start4 == 1)
						Tic_Tac_Toe.start4 = 2;
					else
						Tic_Tac_Toe.start4 = 1;
				}
			}	
			private void button2ActionPerformed(ActionEvent e, int choice) {
				if(choice == 1){
					if(b2.getText() == ""){
						if(Tic_Tac_Toe.start1 == 1)
							b2.setText("X");
						else
							b2.setText("O");
						if(Tic_Tac_Toe.start1 == 1)
							Tic_Tac_Toe.start1 = 2;
						else
							Tic_Tac_Toe.start1 = 1;
					}
				}
				else if(choice == 2){
					Tic_Tac_Toe.start2 = 1;
					if(b2.getText() == ""){
						if(Tic_Tac_Toe.start2 == 1)
							b2.setText("X");
					}
					Random rand = new Random();
					int box = rand.nextInt(9) + 1;
					while(true){
						if(box == 1){
							if(b1.getText() == ""){
								b1.setText("O");
								break;
							}
						}
						else if(box == 3){
							if(b3.getText() == ""){
								b3.setText("O");
								break;
							}
						}
						else if(box == 4){
							if(b4.getText() == ""){
								b4.setText("O");
								break;
							}
						}
						else if(box == 5){
							if(b5.getText() == ""){
								b5.setText("O");
								break;
							}
						}
						else if(box == 6){
							if(b6.getText() == ""){
								b6.setText("O");
								break;
							}
						}
						else if(box == 7){
							if(b7.getText() == ""){
								b7.setText("O");
								break;
							}
						}
						else if(box == 8){
							if(b8.getText() == ""){
								b8.setText("O");
								break;
							}
						}
						else if(box == 9){
							if(b9.getText() == ""){
								b9.setText("O");
								break;
							}
						}
						else if(b1.getText() != "" && b3.getText() != "" && b4.getText() != "" && b5.getText() != "" && b6.getText() != "" && b7.getText() != "" && b8.getText() != "" && b9.getText() != "")
							break;
						
						box = rand.nextInt(9) + 1;
					}
				}
				else if(choice == 4){
					Tic_Tac_Toe.start4 = 1;
					if(b2.getText() == ""){
						if(Tic_Tac_Toe.start4 == 1)
							b2.setText("X");
						else
							b2.setText("O");
						if(Tic_Tac_Toe.start4 == 1)
							Tic_Tac_Toe.start4 = 2;
						else
							Tic_Tac_Toe.start4 = 1;
					}
					if(checkWin() != 3){
						int twoButton = adjacentButton();
						if(twoButton == 1){
							if(b1.getText() == ""){
								b1.setText("O");
							}
						}
						else if(twoButton == 2){
							if(b2.getText() == ""){
								b2.setText("O");
							}
						}
						else if(twoButton == 3){
							if(b3.getText() == ""){
								b3.setText("O");
							}
						}
						else if(twoButton == 4){
							if(b4.getText() == ""){
								b4.setText("O");
							}
						}
						else if(twoButton == 5){
							if(b5.getText() == ""){
								b5.setText("O");
							}
						}
						else if(twoButton == 6){
							if(b6.getText() == ""){
								b6.setText("O");
							}
						}
						else if(twoButton == 7){
							if(b7.getText() == ""){
								b7.setText("O");
							}
						}
						else if(twoButton == 8){
							if(b8.getText() == ""){
								b8.setText("O");
							}
						}
						else if(twoButton == 9){
							if(b9.getText() == ""){
								b9.setText("O");
							}
						}
						else if(twoButton == 0){
							if(Tic_Tac_Toe.start4 == 2){

								if(b2.getText() == "X"){

									if(b1.getText() == ""){
										b1.setText("O");
									}
									if(b3.getText() == ""){
										b3.setText("O");
									}

									if(b5.getText() == ""){
										b5.setText("O");
									}
									else{
										while(true){
											if(checkWin() == 3){
												break;
											}
											Random rand = new Random();
											int button = rand.nextInt(9) + 1;
											if(button == 1){	
												if(b1.getText() == ""){
													b1.setText("O");
													break;
												}
											}

											else if(button == 2){
												if(b2.getText() == ""){
													b2.setText("O");
													break;
												}
											}

											else if(button == 3){
												if(b3.getText() == ""){
													b3.setText("O");
													break;
												}
											}
											else if(button == 4){
												if(b4.getText() == ""){
													b4.setText("O");
													break;
												}
											}

											else if(button == 5){
												if(b5.getText() == ""){
													b5.setText("O");
													break;
												}
											}

											else if(button == 6){
												if(b6.getText() == ""){
													b6.setText("O");
													break;
												}
											}
											else if(button == 7){
												if(b7.getText() == ""){
													b7.setText("O");
													break;
												}
											}
											else if(button == 8){
												if(b8.getText() == ""){
													b8.setText("O");
													break;
												}
											}
											else if(button == 9){
												if(b9.getText() == ""){
													b9.setText("O");
													break;
												}
											}
										}
									}
								}
							}
						}
					}
					if(Tic_Tac_Toe.start4 == 1)
						Tic_Tac_Toe.start4 = 2;
					else
						Tic_Tac_Toe.start4 = 1;
				}
			}
			private void button3ActionPerformed(ActionEvent e, int choice) {
				if(choice == 1){
					if(b3.getText() == ""){
						if(Tic_Tac_Toe.start1 == 1)
							b3.setText("X");
						else
							b3.setText("O");
						if(Tic_Tac_Toe.start1 == 1)
							Tic_Tac_Toe.start1 = 2;
						else
							Tic_Tac_Toe.start1 = 1;
					}
				}
				else if(choice == 2){
					Tic_Tac_Toe.start2 = 1;
					if(b3.getText() == ""){
						if(Tic_Tac_Toe.start2 == 1)
							b3.setText("X");
					}
					Random rand = new Random();
					int box = rand.nextInt(9) + 1;
					while(true){
						if(box == 2){
							if(b2.getText() == ""){
								b2.setText("O");
								break;
							}
						}
						else if(box == 1){
							if(b1.getText() == ""){
								b1.setText("O");
								break;
							}
						}
						else if(box == 4){
							if(b4.getText() == ""){
								b4.setText("O");
								break;
							}
						}
						else if(box == 5){
							if(b5.getText() == ""){
								b5.setText("O");
								break;
							}
						}
						else if(box == 6){
							if(b6.getText() == ""){
								b6.setText("O");
								break;
							}
						}
						else if(box == 7){
							if(b7.getText() == ""){
								b7.setText("O");
								break;
							}
						}
						else if(box == 8){
							if(b8.getText() == ""){
								b8.setText("O");
								break;
							}
						}
						else if(box == 9){
							if(b9.getText() == ""){
								b9.setText("O");
								break;
							}
						}
						else if(b1.getText() != "" && b2.getText() != "" && b4.getText() != "" && b5.getText() != "" && b6.getText() != "" && b7.getText() != "" && b8.getText() != "" && b9.getText() != "")
							break;
		
						box = rand.nextInt(9) + 1;
					}
				}
				else if(choice == 4){
					Tic_Tac_Toe.start4 = 1;
					if(b3.getText() == ""){
						if(Tic_Tac_Toe.start4 == 1)
							b3.setText("X");
						else
							b3.setText("O");
						if(Tic_Tac_Toe.start4 == 1)
							Tic_Tac_Toe.start4 = 2;
						else
							Tic_Tac_Toe.start4 = 1;
					}
					if(checkWin() != 3){
						int twoButton = adjacentButton();
						if(twoButton == 1){
							if(b1.getText() == ""){
								b1.setText("O");
							}
						}
						else if(twoButton == 2){
							if(b2.getText() == ""){
								b2.setText("O");
							}
						}
						else if(twoButton == 3){
							if(b3.getText() == ""){
								b3.setText("O");
							}
						}
						else if(twoButton == 4){
							if(b4.getText() == ""){
								b4.setText("O");
							}
						}
						else if(twoButton == 5){
							if(b5.getText() == ""){
								b5.setText("O");
							}
						}
						else if(twoButton == 6){
							if(b6.getText() == ""){
								b6.setText("O");
							}
						}
						else if(twoButton == 7){
							if(b7.getText() == ""){
								b7.setText("O");
							}
						}
						else if(twoButton == 8){
							if(b8.getText() == ""){
								b8.setText("O");
							}
						}
						else if(twoButton == 9){
							if(b9.getText() == ""){
								b9.setText("O");
							}
						}
						else if(twoButton == 0){
							if(Tic_Tac_Toe.start4 == 2){

								if(b3.getText() == "X"){
									if(b2.getText() == ""){
										b2.setText("O");
									}

									else if(b6.getText() == ""){
										b6.setText("O");
									}

									else if(b5.getText() == ""){
										b5.setText("O");
									}
									else{
										while(true){
											if(checkWin() == 3){
												break;
											}
											Random rand = new Random();
											int button = rand.nextInt(9) + 1;
											if(button == 1){	
												if(b1.getText() == ""){
													b1.setText("O");
													break;
												}
											}

											else if(button == 2){
												if(b2.getText() == ""){
													b2.setText("O");
													break;
												}
											}
											else if(button == 3){
												if(b3.getText() == ""){
													b3.setText("O");
													break;
												}
											}

											else if(button == 4){
												if(b4.getText() == ""){
													b4.setText("O");
													break;
												}
											}

											else if(button == 5){
												if(b5.getText() == ""){
													b5.setText("O");
													break;
												}
											}

											else if(button == 6){
												if(b6.getText() == ""){
													b6.setText("O");
													break;
												}
											}
											else if(button == 7){
												if(b7.getText() == ""){
													b7.setText("O");
													break;
												}
											}
											else if(button == 8){
												if(b8.getText() == ""){
													b8.setText("O");
													break;
												}
											}
											else if(button == 9){
												if(b9.getText() == ""){
													b9.setText("O");
													break;
												}
											}
										}
									}
								}
							}
						}
					}
					if(Tic_Tac_Toe.start4 == 1)
						Tic_Tac_Toe.start4 = 2;
					else
						Tic_Tac_Toe.start4 = 1;
				}
			}
			private void button4ActionPerformed(ActionEvent e, int choice) {
				if(choice == 1){
					if(b4.getText() == ""){
						if(Tic_Tac_Toe.start1 == 1)
							b4.setText("X");
						else
							b4.setText("O");
						if(Tic_Tac_Toe.start1 == 1)
							Tic_Tac_Toe.start1 = 2;
						else
							Tic_Tac_Toe.start1 = 1;
					}
				}
				else if(choice == 2){
					Tic_Tac_Toe.start2 = 1;
					if(b4.getText() == ""){
						if(Tic_Tac_Toe.start2 == 1)
							b4.setText("X");
					}
					Random rand = new Random();
					int box = rand.nextInt(9) + 1;
					while(true){
						if(box == 2){
							if(b2.getText() == ""){
								b2.setText("O");
								break;
							}
						}
						else if(box == 3){
							if(b3.getText() == ""){
								b3.setText("O");
								break;
							}
						}
						else if(box == 1){
							if(b1.getText() == ""){
								b1.setText("O");
								break;
							}
						}
						else if(box == 5){
							if(b5.getText() == ""){
								b5.setText("O");
								break;
							}
						}
						else if(box == 6){
							if(b6.getText() == ""){
								b6.setText("O");
								break;
							}
						}
						else if(box == 7){
							if(b7.getText() == ""){
								b7.setText("O");
								break;
							}
						}
						else if(box == 8){
							if(b8.getText() == ""){
								b8.setText("O");
								break;
							}
						}
						else if(box == 9){
							if(b9.getText() == ""){
								b9.setText("O");
								break;
							}
						}
						else if(b1.getText() != "" && b2.getText() != "" && b3.getText() != "" && b5.getText() != "" && b6.getText() != "" && b7.getText() != "" && b8.getText() != "" && b9.getText() != "")
							break;
					
						box = rand.nextInt(9) + 1;
					}
				}
				else if(choice == 4){
					Tic_Tac_Toe.start4 = 1;
					if(b4.getText() == ""){
						if(Tic_Tac_Toe.start4 == 1)
							b4.setText("X");
						else
							b4.setText("O");
						if(Tic_Tac_Toe.start4 == 1)
							Tic_Tac_Toe.start4 = 2;
						else
							Tic_Tac_Toe.start4 = 1;
					}
					if(checkWin() != 3){
						int twoButton = adjacentButton();
						if(twoButton == 1){
							if(b1.getText() == ""){
								b1.setText("O");
							}
						}
						else if(twoButton == 2){
							if(b2.getText() == ""){
								b2.setText("O");
							}
						}
						else if(twoButton == 3){
							if(b3.getText() == ""){
								b3.setText("O");
							}
						}
						else if(twoButton == 4){
							if(b4.getText() == ""){
								b4.setText("O");
							}
						}
						else if(twoButton == 5){
							if(b5.getText() == ""){
								b5.setText("O");
							}
						}
						else if(twoButton == 6){
							if(b6.getText() == ""){
								b6.setText("O");
							}
						}
						else if(twoButton == 7){
							if(b7.getText() == ""){
								b7.setText("O");
							}
						}
						else if(twoButton == 8){
							if(b8.getText() == ""){
								b8.setText("O");
							}
						}
						else if(twoButton == 9){
							if(b9.getText() == ""){
								b9.setText("O");
							}
						}
						else if(twoButton == 0){
							if(Tic_Tac_Toe.start4 == 2){
								if(b4.getText() == "X"){

									if(b1.getText() == ""){
										b1.setText("O");
									}
									else if(b7.getText() == "")
									{
										b7.setText("O");
									}

									else if(b5.getText() == "")
									{
										b5.setText("O");
									}
									else{
										while(true){
											if(checkWin() == 3){
												break;
											}
											Random rand = new Random();
											int button = rand.nextInt(9) + 1;
											if(button == 1){	
												if(b1.getText() == ""){
													b1.setText("O");
													break;
												}
											}
											else if(button == 2){
												if(b2.getText() == ""){
													b2.setText("O");
													break;
												}
											}
											else if(button == 3){
												if(b3.getText() == ""){
													b3.setText("O");
													break;
												}
											}

											else if(button == 4){
												if(b4.getText() == ""){
													b4.setText("O");
													break;
												}
											}
											else if(button == 5){
												if(b5.getText() == ""){
													b5.setText("O");
													break;
												}
											}

											else if(button == 6){
												if(b6.getText() == ""){
													b6.setText("O");
													break;
												}
											}
											else if(button == 7){
												if(b7.getText() == ""){
													b7.setText("O");
													break;
												}
											}
											else if(button == 8){
												if(b8.getText() == ""){
													b8.setText("O");
													break;
												}
											}
											else if(button == 9){
												if(b9.getText() == ""){
													b9.setText("O");
													break;
												}
											}
										}
									}
								}
							}
						}
					}
					if(Tic_Tac_Toe.start4 == 1)
						Tic_Tac_Toe.start4 = 2;
					else
						Tic_Tac_Toe.start4 = 1;
			}
			}
			private void button5ActionPerformed(ActionEvent e, int choice) {
				if(choice == 1){
					if(b5.getText() == ""){
						if(Tic_Tac_Toe.start1 == 1)
							b5.setText("X");
						else
							b5.setText("O");
						if(Tic_Tac_Toe.start1 == 1)
							Tic_Tac_Toe.start1 = 2;
						else
							Tic_Tac_Toe.start1 = 1;
					}
				}
				else if(choice == 2){
					Tic_Tac_Toe.start2 = 1;
					if(b5.getText() == ""){
						if(Tic_Tac_Toe.start2 == 1)
							b5.setText("X");
					}
					Random rand = new Random();
					int box = rand.nextInt(9) + 1;
					while(true){
						if(box == 2){
							if(b2.getText() == ""){
								b2.setText("O");
								break;
							}
						}
						else if(box == 3){
							if(b3.getText() == ""){
								b3.setText("O");
								break;
							}
						}
						else if(box == 4){
							if(b4.getText() == ""){
								b4.setText("O");
								break;
							}
						}
						else if(box == 1){
							if(b1.getText() == ""){
								b1.setText("O");
								break;
							}
						}
						else if(box == 6){
							if(b6.getText() == ""){
								b6.setText("O");
								break;
							}
						}
						else if(box == 7){
							if(b7.getText() == ""){
								b7.setText("O");
								break;
							}
						}
						else if(box == 8){
							if(b8.getText() == ""){
								b8.setText("O");
								break;
							}
						}
						else if(box == 9){
							if(b9.getText() == ""){
								b9.setText("O");
								break;
							}
						}
						else if(b1.getText() != "" && b2.getText() != "" && b3.getText() != "" && b4.getText() != "" && b6.getText() != "" && b7.getText() != "" && b8.getText() != "" && b9.getText() != "")
							break;
					
						box = rand.nextInt(9) + 1;
					}
				}
				else if(choice == 4){
					Tic_Tac_Toe.start4 = 1;
					if(b5.getText() == ""){
						if(Tic_Tac_Toe.start4 == 1)
							b5.setText("X");
						else
							b5.setText("O");
						if(Tic_Tac_Toe.start4 == 1)
							Tic_Tac_Toe.start4 = 2;
						else
							Tic_Tac_Toe.start4 = 1;
					}
					if(checkWin() != 3){
						int twoButton = adjacentButton();
						if(twoButton == 1){
							if(b1.getText() == ""){
								b1.setText("O");
							}
						}
						else if(twoButton == 2){
							if(b2.getText() == ""){
								b2.setText("O");
							}
						}
						else if(twoButton == 3){
							if(b3.getText() == ""){
								b3.setText("O");
							}
						}
						else if(twoButton == 4){
							if(b4.getText() == ""){
								b4.setText("O");
							}
						}
						else if(twoButton == 5){
							if(b5.getText() == ""){
								b5.setText("O");
							}
						}
						else if(twoButton == 6){
							if(b6.getText() == ""){
								b6.setText("O");
							}
						}
						else if(twoButton == 7){
							if(b7.getText() == ""){
								b7.setText("O");
							}
						}
						else if(twoButton == 8){
							if(b8.getText() == ""){
								b8.setText("O");
							}
						}
						else if(twoButton == 9){
							if(b9.getText() == ""){
								b9.setText("O");
							}
						}
						else if(twoButton == 0){
							if(Tic_Tac_Toe.start4 == 2){
								if(b5.getText() == "X")
								{

									if(b1.getText() == ""){
										b1.setText("O");
									}
									else if(b3.getText() == ""){
										b3.setText("O");
									}
									else if(b7.getText() == ""){
										b7.setText("O");
									}
									else if(b9.getText() == ""){
										b9.setText("O");
									}

									else if(b2.getText() == ""){
										b2.setText("O");
									}

									else if(b4.getText() == ""){
										b4.setText("O");
									}
									else if(b6.getText() == ""){
										b6.setText("O");
									}

									else if(b8.getText() == ""){
										b8.setText("O");
									}
									else if(checkWin() == 3){
									}
								}
							}
						}
					}
					if(Tic_Tac_Toe.start4 == 1)
						Tic_Tac_Toe.start4 = 2;
					else
						Tic_Tac_Toe.start4 = 1;
				}
			}
			private void button6ActionPerformed(ActionEvent e, int choice) {
				if(choice == 1){
					if(b6.getText() == ""){
						if(Tic_Tac_Toe.start1 == 1)
							b6.setText("X");
						else
							b6.setText("O");
						if(Tic_Tac_Toe.start1 == 1)
							Tic_Tac_Toe.start1 = 2;
						else
							Tic_Tac_Toe.start1 = 1;
					}
				}
				else if(choice == 2){
					Tic_Tac_Toe.start2 = 1;
					if(b6.getText() == ""){
						if(Tic_Tac_Toe.start2 == 1)
							b6.setText("X");
					}
					Random rand = new Random();
					int box = rand.nextInt(9) + 1;
					while(true){
						if(box == 2){
							if(b2.getText() == ""){
								b2.setText("O");
								break;
							}
						}
						else if(box == 3){
							if(b3.getText() == ""){
								b3.setText("O");
								break;
							}
						}
						else if(box == 4){
							if(b4.getText() == ""){
								b4.setText("O");
								break;
							}
						}
						else if(box == 5){
							if(b5.getText() == ""){
								b5.setText("O");
								break;
							}
						}
						else if(box == 1){
							if(b1.getText() == ""){
								b1.setText("O");
								break;
							}
						}
						else if(box == 7){
							if(b7.getText() == ""){
								b7.setText("O");
								break;
							}
						}
						else if(box == 8){
							if(b8.getText() == ""){
								b8.setText("O");
								break;
							}
						}
						else if(box == 9){
							if(b9.getText() == ""){
								b9.setText("O");
								break;
							}
						}
						else if(b1.getText() != "" && b2.getText() != "" && b3.getText() != "" && b4.getText() != "" && b5.getText() != "" && b7.getText() != "" && b8.getText() != "" && b9.getText() != "")
							break;
			
						box = rand.nextInt(9) + 1;
					}
				}
				else if(choice == 4){
					Tic_Tac_Toe.start4 = 1;
					if(b6.getText() == ""){
						if(Tic_Tac_Toe.start4 == 1)
							b6.setText("X");
						else
							b6.setText("O");
						if(Tic_Tac_Toe.start4 == 1)
							Tic_Tac_Toe.start4 = 2;
						else
							Tic_Tac_Toe.start4 = 1;
					}
					if(checkWin() != 3){
						int twoButton = adjacentButton();
						if(twoButton == 1){
							if(b1.getText() == ""){
								b1.setText("O");
							}
						}
						else if(twoButton == 2){
							if(b2.getText() == ""){
								b2.setText("O");
							}
						}
						else if(twoButton == 3){
							if(b3.getText() == ""){
								b3.setText("O");
							}
						}
						else if(twoButton == 4){
							if(b4.getText() == ""){
								b4.setText("O");
							}
						}
						else if(twoButton == 5){
							if(b5.getText() == ""){
								b5.setText("O");
							}
						}
						else if(twoButton == 6){
							if(b6.getText() == ""){
								b6.setText("O");
							}
						}
						else if(twoButton == 7){
							if(b7.getText() == ""){
								b7.setText("O");
							}
						}
						else if(twoButton == 8){
							if(b8.getText() == ""){
								b8.setText("O");
							}
						}
						else if(twoButton == 9){
							if(b9.getText() == ""){
								b9.setText("O");
							}
						}
						else if(twoButton == 0){
							if(Tic_Tac_Toe.start4 == 2){
								if(b6.getText() == "X"){

									if(b3.getText() == ""){
										b3.setText("O");
									}
									else if(b9.getText() == ""){
										b9.setText("O");
									}

									else if(b5.getText() == ""){
										b5.setText("O");
									}
									else{
										while(true){
											Random rand = new Random();
											int button = rand.nextInt(9) + 1;
											if(button == 1){	
												if(b1.getText() == ""){
													b1.setText("O");
													break;
												}
											}
											else if(button == 2){
												if(b2.getText() == ""){
													b2.setText("O");
													break;
												}
											}
											else if(button == 3){
												if(b3.getText() == ""){
													b3.setText("O");
													break;
												}
											}
											else if(button == 4){
												if(b4.getText() == ""){
													b4.setText("O");
													break;
												}
											}

											else if(button == 5){
												if(b5.getText() == ""){
													b5.setText("O");
													break;
												}
											}
											else if(button == 6){
												if(b6.getText() == ""){
													b6.setText("O");
													break;
												}
											}

											else if(button == 7){
												if(b7.getText() == ""){
													b7.setText("O");
													break;
												}
											}
											else if(button == 8){
												if(b8.getText() == ""){
													b8.setText("O");
													break;
												}
											}
											else if(button == 9){
												if(b9.getText() == ""){
													b9.setText("O");
													break;
												}
											}
											else if(checkWin() == 3){
												break;
											}
										}
									}
								}
							}
						}
					}
					if(Tic_Tac_Toe.start4 == 1)
						Tic_Tac_Toe.start4 = 2;
					else
						Tic_Tac_Toe.start4 = 1;
				}
			}
			private void button7ActionPerformed(ActionEvent e, int choice) {
				if(choice == 1){
					if(b7.getText() == ""){
						if(Tic_Tac_Toe.start1 == 1)
							b7.setText("X");
						else
							b7.setText("O");
						if(Tic_Tac_Toe.start1 == 1)
							Tic_Tac_Toe.start1 = 2;
						else
							Tic_Tac_Toe.start1 = 1;
					}
				}
				else if(choice == 2){
					Tic_Tac_Toe.start2 = 1;
					if(b7.getText() == ""){
						if(Tic_Tac_Toe.start2 == 1)
							b7.setText("X");
					}
					Random rand = new Random();
					int box = rand.nextInt(9) + 1;
					while(true){
						if(box == 2){
							if(b2.getText() == ""){
								b2.setText("O");
								break;
							}
						}
						else if(box == 3){
							if(b3.getText() == ""){
								b3.setText("O");
								break;
							}
						}
						else if(box == 4){
							if(b4.getText() == ""){
								b4.setText("O");
								break;
							}
						}
						else if(box == 5){
							if(b5.getText() == ""){
								b5.setText("O");
								break;
							}
						}
						else if(box == 6){
							if(b6.getText() == ""){
								b6.setText("O");
								break;
							}
						}
						else if(box == 1){
							if(b1.getText() == ""){
								b1.setText("O");
								break;
							}
						}
						else if(box == 8){
							if(b8.getText() == ""){
								b8.setText("O");
								break;
							}
						}
						else if(box == 9){
							if(b9.getText() == ""){
								b9.setText("O");
								break;
							}
						}
						else if(b1.getText() != "" && b2.getText() != "" && b3.getText() != "" && b4.getText() != "" && b5.getText() != "" && b6.getText() != "" && b8.getText() != "" && b9.getText() != "")
							break;
						
						box = rand.nextInt(9) + 1;
					}
				}
				else if(choice == 4){
					Tic_Tac_Toe.start4 = 1;
					if(b7.getText() == ""){
						if(Tic_Tac_Toe.start4 == 1)
							b7.setText("X");
						else
							b7.setText("O");
						if(Tic_Tac_Toe.start4 == 1)
							Tic_Tac_Toe.start4 = 2;
						else
							Tic_Tac_Toe.start4 = 1;
					}
					if(checkWin() != 3){
						int twoButton = adjacentButton();
						if(twoButton == 1){
							if(b1.getText() == ""){
								b1.setText("O");
							}
						}
						else if(twoButton == 2){
							if(b2.getText() == ""){
								b2.setText("O");
							}
						}
						else if(twoButton == 3){
							if(b3.getText() == ""){
								b3.setText("O");
							}
						}
						else if(twoButton == 4){
							if(b4.getText() == ""){
								b4.setText("O");
							}
						}
						else if(twoButton == 5){
							if(b5.getText() == ""){
								b5.setText("O");
							}
						}
						else if(twoButton == 6){
							if(b6.getText() == ""){
								b6.setText("O");
							}
						}
						else if(twoButton == 7){
							if(b7.getText() == ""){
								b7.setText("O");
							}
						}
						else if(twoButton == 8){
							if(b8.getText() == ""){
								b8.setText("O");
							}
						}
						else if(twoButton == 9){
							if(b9.getText() == ""){
								b9.setText("O");
							}
						}
						else if(twoButton == 0){
							if(Tic_Tac_Toe.start4 == 2){
								if(b7.getText() == "X"){

									if(b4.getText() == ""){
										b4.setText("O");
									}

									if(b8.getText() == ""){
										b8.setText("O");
									}
									else if(b5.getText() == ""){
										b5.setText("O");
									}
									else{
										while(true){
											if(checkWin() == 3){
												break;
											}
											Random rand = new Random();
											int button = rand.nextInt(9) + 1;
											if(button == 1){	
												if(b1.getText() == ""){
													b1.setText("O");
													break;
												}
											}
											else if(button == 2){
												if(b2.getText() == ""){
													b2.setText("O");
													break;
												}
											}
											else if(button == 3){
												if(b3.getText() == ""){
													b3.setText("O");
													break;
												}
											}
											else if(button == 4){
												if(b4.getText() == ""){
													b4.setText("O");
													break;
												}
											}

											else if(button == 5){
												if(b5.getText() == ""){
													b5.setText("O");
													break;
												}
											}

											else if(button == 6){
												if(b6.getText() == ""){
													b6.setText("O");
													break;
												}
											}

											else if(button == 7){
												if(b7.getText() == ""){
													b7.setText("O");
													break;
												}
											}
											else if(button == 8){
												if(b8.getText() == ""){
													b8.setText("O");
													break;
												}
											}

											else if(button == 9){
												if(b9.getText() == ""){
													b9.setText("O");
													break;
												}
											}
										}
									}
								}
							}
						}
					}
					if(Tic_Tac_Toe.start4 == 1)
						Tic_Tac_Toe.start4 = 2;
					else
						Tic_Tac_Toe.start4 = 1;
				}
			}
			private void button8ActionPerformed(ActionEvent e, int choice) {
				if(choice == 1){
					if(b8.getText() == ""){
						if(Tic_Tac_Toe.start1 == 1)
							b8.setText("X");
						else
							b8.setText("O");
						if(Tic_Tac_Toe.start1 == 1)
							Tic_Tac_Toe.start1 = 2;
						else
							Tic_Tac_Toe.start1 = 1;
					}
				}
				else if(choice == 2){
					Tic_Tac_Toe.start2 = 1;
					if(b8.getText() == ""){
						if(Tic_Tac_Toe.start2 == 1)
							b8.setText("X");
					}
					Random rand = new Random();
					int box = rand.nextInt(9) + 1;
					while(true){
						if(box == 2){
							if(b2.getText() == ""){
								b2.setText("O");
								break;
							}
						}
						else if(box == 3){
							if(b3.getText() == ""){
								b3.setText("O");
								break;
							}
						}
						else if(box == 4){
							if(b4.getText() == ""){
								b4.setText("O");
								break;
							}
						}
						else if(box == 5){
							if(b5.getText() == ""){
								b5.setText("O");
								break;
							}
						}
						else if(box == 6){
							if(b6.getText() == ""){
								b6.setText("O");
								break;
							}
						}
						else if(box == 7){
							if(b7.getText() == ""){
								b7.setText("O");
								break;
							}
						}
						else if(box == 1){
							if(b1.getText() == ""){
								b1.setText("O");
								break;
							}
						}
						else if(box == 9){
							if(b9.getText() == ""){
								b9.setText("O");
								break;
							}
						}
						else if(b1.getText() != "" && b2.getText() != "" && b3.getText() != "" && b4.getText() != "" && b5.getText() != "" && b6.getText() != "" && b7.getText() != "" && b9.getText() != "")
							break;
	
						box = rand.nextInt(9) + 1;
					}
				}
				else if(choice == 4){
					Tic_Tac_Toe.start4 = 1;
					if(b8.getText() == ""){
						if(Tic_Tac_Toe.start4 == 1)
							b8.setText("X");
						else
							b8.setText("O");
						if(Tic_Tac_Toe.start4 == 1)
							Tic_Tac_Toe.start4 = 2;
						else
							Tic_Tac_Toe.start4 = 1;
					}
					if(checkWin() != 3){
						int twoButton = adjacentButton();
						if(twoButton == 1){
							if(b1.getText() == ""){
								b1.setText("O");
							}
						}
						else if(twoButton == 2){
							if(b2.getText() == ""){
								b2.setText("O");
							}
						}
						else if(twoButton == 3){
							if(b3.getText() == ""){
								b3.setText("O");
							}
						}
						else if(twoButton == 4){
							if(b4.getText() == ""){
								b4.setText("O");
							}
						}
						else if(twoButton == 5){
							if(b5.getText() == ""){
								b5.setText("O");
							}
						}
						else if(twoButton == 6){
							if(b6.getText() == ""){
								b6.setText("O");
							}
						}
						else if(twoButton == 7){
							if(b7.getText() == ""){
								b7.setText("O");
							}
						}
						else if(twoButton == 8){
							if(b8.getText() == ""){
								b8.setText("O");
							}
						}
						else if(twoButton == 9){
							if(b9.getText() == ""){
								b9.setText("O");
							}
						}
						else if(twoButton == 0){
							if(Tic_Tac_Toe.start4 == 2){
								if(b8.getText() == "X"){

									if(b7.getText() == ""){
										b7.setText("O");
									}
									else if(b9.getText() == ""){
										b9.setText("O");
									}

									else if(b5.getText() == ""){
										b5.setText("O");
									}
									else{
										while(true){
											if(checkWin() == 3){
												break;
											}
											Random rand = new Random();
											int button = rand.nextInt(9) + 1;
											if(button == 1){	
												if(b1.getText() == ""){
													b1.setText("O");
													break;
												}
											}
											else if(button == 2){
												if(b2.getText() == ""){
													b2.setText("O");
													break;
												}
											}
											else if(button == 3){
												if(b3.getText() == ""){
													b3.setText("O");
													break;
												}
											}
											else if(button == 4){
												if(b4.getText() == ""){
													b4.setText("O");
													break;
												}
											}

											else if(button == 5){
												if(b5.getText() == ""){
													b5.setText("O");
													break;
												}
											}

											else if(button == 6){
												if(b6.getText() == ""){
													b6.setText("O");
													break;
												}
											}
											else if(button == 7){
												if(b7.getText() == ""){
													b7.setText("O");
													break;
												}
											}

											else if(button == 8){
												if(b8.getText() == ""){
													b8.setText("O");
													break;
												}
											}

											else if(button == 9){
												if(b9.getText() == ""){
													b9.setText("O");
													break;
												}
											}
										}
									}
								}
							}
						}
					}
					if(Tic_Tac_Toe.start4 == 1)
						Tic_Tac_Toe.start4 = 2;
					else
						Tic_Tac_Toe.start4 = 1;
				}
			}
			private void button9ActionPerformed(ActionEvent e, int choice) {
				if(choice == 1){
					if(b9.getText() == ""){
						if(Tic_Tac_Toe.start1 == 1)
							b9.setText("X");
						else
							b9.setText("O");
						if(Tic_Tac_Toe.start1 == 1)
							Tic_Tac_Toe.start1 = 2;
						else
							Tic_Tac_Toe.start1 = 1;
					}
				}
				else if(choice == 2){
					Tic_Tac_Toe.start2 = 1;
					if(b9.getText() == ""){
						if(Tic_Tac_Toe.start2 == 1)
							b9.setText("X");
					}
					Random rand = new Random();
					int box = rand.nextInt(9) + 1;
					while(true){
						if(box == 2){
							if(b2.getText() == ""){
								b2.setText("O");
								break;
							}
						}
						else if(box == 3){
							if(b3.getText() == ""){
								b3.setText("O");
								break;
							}
						}
						else if(box == 4){
							if(b4.getText() == ""){
								b4.setText("O");
								break;
							}
						}
						else if(box == 5){
							if(b5.getText() == ""){
								b5.setText("O");
								break;
							}
						}
						else if(box == 6){
							if(b6.getText() == ""){
								b6.setText("O");
								break;
							}
						}
						else if(box == 7){
							if(b7.getText() == ""){
								b7.setText("O");
								break;
							}
						}
						else if(box == 8){
							if(b8.getText() == ""){
								b8.setText("O");
								break;
							}
						}
						else if(box == 1){
							if(b1.getText() == ""){
								b1.setText("O");
								break;
							}
						}
						else if(b1.getText() != "" && b2.getText() != "" && b3.getText() != "" && b4.getText() != "" && b5.getText() != "" && b6.getText() != "" && b7.getText() != "" && b8.getText() != "")
							break;
			
						box = rand.nextInt(9) + 1;
					}
				}
				else if(choice == 4){
					Tic_Tac_Toe.start4 = 1;
					if(b9.getText() == ""){
						if(Tic_Tac_Toe.start4 == 1)
							b9.setText("X");
						else
							b9.setText("O");
						if(Tic_Tac_Toe.start4 == 1)
							Tic_Tac_Toe.start4 = 2;
						else
							Tic_Tac_Toe.start4 = 1;
					}
					if(checkWin() != 3){
						int twoButton = adjacentButton();
						if(twoButton == 1){
							if(b1.getText() == ""){
								b1.setText("O");
							}
						}
						else if(twoButton == 2){
							if(b2.getText() == ""){
								b2.setText("O");
							}
						}
						else if(twoButton == 3){
							if(b3.getText() == ""){
								b3.setText("O");
							}
						}
						else if(twoButton == 4){
							if(b4.getText() == ""){
								b4.setText("O");
							}
						}
						else if(twoButton == 5){
							if(b5.getText() == ""){
								b5.setText("O");
							}
						}
						else if(twoButton == 6){
							if(b6.getText() == ""){
								b6.setText("O");
							}
						}
						else if(twoButton == 7){
							if(b7.getText() == ""){
								b7.setText("O");
							}
						}
						else if(twoButton == 8){
							if(b8.getText() == ""){
								b8.setText("O");
							}
						}
						else if(twoButton == 9){
							if(b9.getText() == ""){
								b9.setText("O");
							}
						}
						else if(twoButton == 0){
							if(Tic_Tac_Toe.start4 == 2){
								if(b9.getText() == "X"){
									if(b8.getText() == ""){
										b8.setText("O");
									}
									else if(b5.getText() == ""){
										b5.setText("O");
									}
									else{
										while(true){
											if(checkWin() == 3){
												break;
											}
											Random rand = new Random();
											int button = rand.nextInt(9) + 1;
											if(button == 1){	
												if(b1.getText() == ""){
													b1.setText("O");
													break;
												}
											}
											else if(button == 2){
												if(b2.getText() == ""){
													b2.setText("O");
													break;
												}
											}
											else if(button == 3){
												if(b3.getText() == ""){
													b3.setText("O");
													break;
												}
											}
											else if(button == 4){
												if(b4.getText() == ""){
													b4.setText("O");
													break;
												}
											}

											//									else if(button == 5){
											//										if(b5.getText() == ""){
											//											b5.setText("O");
											//											break;
											//										}
											//									}

											else if(button == 6){
												if(b6.getText() == ""){
													b6.setText("O");
													break;
												}
											}
											else if(button == 7){
												if(b7.getText() == ""){
													b7.setText("O");
													break;
												}
											}
										}
									}
								}
							}
						}
					}
					if(Tic_Tac_Toe.start4 == 1)
						Tic_Tac_Toe.start4 = 2;
					else
						Tic_Tac_Toe.start4 = 1;
				}
			}
			}
		Grid obj = new Grid();
		obj.createGrid();
	}
	public static void main(String[] args) {
		
		JFrame first = new JFrame();
		first.setTitle("Tic-Tac-Toe");
		first.setSize(550, 550);
		
		JLabel startWindow = new JLabel();
		startWindow.setBounds(150, 80, 220, 100);
		startWindow.setText("<html><span style='font-size:30px'>"+"Tic-Tac-Toe"+"</span></html>");
		
		JButton start = new JButton("Start Game");
		start.setBounds(195, 210, 130, 50);
		first.add(start);
		start.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				first.dispose();
				Tic_Tac_Toe newWindow = new Tic_Tac_Toe();
				newWindow.nextPage();
			}
		});
		
		JButton exit = new JButton("Exit");
		exit.setBounds(195, 320, 130, 50);
		first.add(exit);
		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		
		first.add(startWindow);
		first.setLayout(null);
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		first.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
