/*
 * Douglas Wendel
 * CSCE 145
 * SL1
 */

import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to the Maliban forest! It is so radical "
				+ "\nthat you decided to join us on the adventure we have in store for you today. "
				+ "\nMy name is Douglas and my personal favorite is the hunting package we offer. "
				+ "\nWould you mind giving me your name?");
		String name = key.nextLine();
		
		System.out.println("Hello " + name +
				", would you like to go zip lining, surfing, "
				+ "\nor hunting?");
		
		String Response1 = key.nextLine();
		
		if(Response1.equalsIgnoreCase("zip lining"))
		{
			System.out.println("You walk up the mountain to the zip lining shop and are greeted "
					+ "\nby a gnarly man. “How are you doing today? Welcome to Zip lining " + name + ", "
					+ " \nI am Chin and I will be your amazing zip lining guide through the beautiful Mailban mountains. "
					+ "\nAre you looking to do the extra scary course today?” Yes or no");
			String responseZip1 = key.nextLine();
			if(responseZip1.equalsIgnoreCase("No"))
			{
				System.out.println("You lost! The end.");;
				System.exit(0);
				
			}
			
			if(responseZip1.equalsIgnoreCase("Yes"))
			{
				System.out.println("The tour guide jumps in excitement and says, Awesome! You better make sure you button "
						+ "\nup your harness tight! Type continue when you are ready.");
				String responseZip2 = key.nextLine();
				
				if(responseZip2.equalsIgnoreCase("Continue"))
				{
					System.out.println("You are walking down the trail towards the spooky tunnel as to which you are supposed"
							+ " \no go through. You can go right, left, or stop, which way do you wish to go?");
					String responseZip3 = key.nextLine();
				
					if(responseZip3.equalsIgnoreCase("Right"))
					{
						System.out.println("It is pitch black dark, the flashlights are not working properly"
								+ "\nand you decide to keep on walking. You continue to walk in the dark tunnel and you trip and fall down a"
								+ "\nDEEP DARK HOLE AND ARE NEVER TO BE FOUND AGAIN! THE END!");
						System.out.println("Goodbye.");
						System.exit(0);
					
					}
					if(responseZip3.equalsIgnoreCase("Left"));
					{
						System.out.println("The tunnel is dark, spooky, and bats are flying everywhere. You continue"
								+ "\nto walk through and find a lit torch guiding you to the end of the cave. You "
								+ "\ncontinue to follow more lit torches and eventually find the first zipline and you go down "
								+ "\nit. You now get to enjoy the rest of the day ziplining through the mountains, caves and the spooky forest!");
						System.out.println("Congratulations! \nYou have won the game! \nGoodbye!");
						System.exit(0);
					}
					if(responseZip3.equalsIgnoreCase("Stop"))
					{
						System.out.println("You quit! \nThe end! \nGoodbye!");
						System.exit(0);
					}
		    
			     }
			}
		}
				
				
				
				
				
				
			else if(Response1.equalsIgnoreCase("Surfing"))
			{
					System.out.println("You enter the surf shop and a grom walks up to you and says, Yoooo " + name + " are"
							+ " \nyou looking to rent a surfboard? Yes or no");
					String responseSurf1 = key.nextLine();
					if(responseSurf1.equalsIgnoreCase("No"))
					{
						System.out.println("Awww man c'mon rent a surfboard. The waves are good and you will have a lot of fun!"
								+ " \nSays the grom. You eventually are given a final choice, wether to continue and rent a surfboard"
								+ " \nor to decide not to rent one. Type either Continue or Stop.");
						String responseSurf1a = key.nextLine();

						if(responseSurf1a.equalsIgnoreCase("Stop"))
						{
							System.out.println("You have quit! Goodbye");
							System.exit(0);
						}
						if(responseSurf1a.equalsIgnoreCase("Continue"))
						{
							System.out.println("Aesome man here you go.\nYou grab the surfboard and thank the grom, its time to load up the car!");
							System.out.println("As you are driving down the coast you realize the waves are very big. You decide to pull over and"
									+ " \nask one of the surfers walking on the road where he suggests you go. Hey man I am looking for some smaller waves"
									+ " \nwhere do you suggest? The surfer replies, Whats up man, not too many small waves on the coast today. I would suggest"
									+ " \nyou just paddle out here. You reply, looks like I'll be paddling out here, wish me luck!"
									+ " \nLater on you are debating whether or not to go for the first, second, or third wave. Pick a number 1-3 which will"
									+ " \ndecide what wave you want to catch.");
							String responseSurf1b = key.nextLine();
							if(responseSurf1b.equalsIgnoreCase("1"))
							{
								System.out.println("You missed the wave, better luck next time! \nTHE END! \nGoodbye");
								System.exit(0);
							}
							else if(responseSurf1b.equalsIgnoreCase("2"))
							{
								System.out.println("Oh no, you nose dove on the drop and hit your face on the reef! \nTHE END! \nGoodbye!");
								System.exit(0);
							}
							else if(responseSurf1b.equalsIgnoreCase("3"))
							{
								System.out.println("Yewwwww!!!! You caught the wave, rode the barrel and came out super stoked! \nYou have won the game! \nThe end!");
								System.exit(0);
							}
						}
					}
			
					if(responseSurf1.equalsIgnoreCase("Yes"))
					{
						System.out.println("Aesome man here you go.\nYou grab the surfboard and thank the grom, its time to load up the car!");
						System.out.println("As you are driving down the coast you realize the waves are very big. You decide to pull over and"
								+ " \nask one of the surfers walking on the road where he suggests you go. Hey man I am looking for some smaller waves"
								+ " \nwhere do you suggest? The surfer replies, Whats up man, not too many small waves on the coast today. I would suggest"
								+ " \nyou just paddle out here. You reply, looks like I'll be paddling out here, wish me luck!"
								+ " \nLater on you are debating whether or not to go for the first, second, or third wave. Pick a number 1-3 which will"
								+ " \ndecide what wave you want to catch.");
						String responseSurf1main = key.nextLine();
						if(responseSurf1main.equalsIgnoreCase("1"))
						{
							System.out.println("You missed the wave, better luck next time! \nTHE END! \nGoodbye");
							System.exit(0);
						}
						else if(responseSurf1main.equalsIgnoreCase("2"))
						{
							System.out.println("Oh no, you nose dove on the drop and hit your face on the reef! \nTHE END! \nGoodbye!");
							System.exit(0);
						}
						else if(responseSurf1main.equalsIgnoreCase("3"))
						{
							System.out.println("Yewwwww!!!! You caught the wave, rode the barrel and came out super stoked! \nYou have won the game! \nThe end!");
							System.exit(0);
						}
				

					}
				}
					else if (Response1.equalsIgnoreCase("Hunting"))
					{
						System.out.println("Welcome " +name+ " to our hunting adventure! I am very excited that you chose to join us on this wonderful experience. "
								+ "\nYou are truly going to enjoy it. Once you are ready, say so and we will continue to get you prepapred to go hunting! "
								+ "\nSay ready when you are ready.");
						String Hunting1 = key.nextLine();
						
						if(Hunting1.equalsIgnoreCase("Ready"))
						{
							System.out.println("Hello " + name + " You have three hunting options. Bear, Deer and Elk. Choose which animal you wish to hunt!");
							String Hunting2 = key.nextLine();
							
							if(Hunting2.equalsIgnoreCase("Bear"))
							{
								System.out.println("Hello! Welcome " + name + " to Bear hunting. This is a very dangerous but fun hunting experience! Have you "
										+ "\never been hunting before? Yes or no.");
								String HuntingBear1 = key.nextLine();
								
								if(HuntingBear1.equalsIgnoreCase("Yes"))
								{
									System.out.println("Perfect! We will not be doing any training and you can get out in the woods in no time! Please make "
											+ "\nsure you follow your tour guides instructions at all times to prevent any injuries.");
									System.out.println("Tour Guide: Welcome to our hunting adventure. Here is where I am going to give you all the supplies"
											+ "\nand information you need to be prepared to go bear hunting with us today. Now you need to make sure you are safe"
											+ "\nat all times. Your tour guides will be carrying your gun at all times but once you are in the stand waiting for"
											+ "\na bear you will be in control of your gun. Since this requires previosu hunting and/or shooting experience we wont"
											+ "\nbe teaching you how to do any of that. You will need to put on camoflauge and face paint so you cannot be seen by any"
											+ "\nanimals.");
									System.out.println("Once you have done that we are ready to go. You will be given a choice wether to go to the first stand, "
											+ "the second stand, or the ground stand. Please type, first, second, or ground to choose.");
									String HuntingBear1a = key.nextLine();
									if(HuntingBear1a.equalsIgnoreCase("First"))
									{
										System.out.println("The first blind is a tree stand, you climb up a ladder and sit with your guide. You have alot of bears "
												+ "\naround you and your tour guide is getting a little nervous because they could make the stand fall. Your tour guide "
												+ "\ntells you to shoot your gun so they go away and you can wait until they come back later to hunt them. The gun shot"
												+ "\nstartles the bears and they pull your stand down. You and your tour guide fall and roll down a mountain and die. "
												+ "\nYou have lost the game! The end");
										System.exit(0);										
									}
									if(HuntingBear1a.equalsIgnoreCase("Second"))
									{
										System.out.println("The second blind is a man made blind that is on stilts 15 feet above the ground. It is not in amazing "
												+ "\ncondition but the tour guide claims but it is  a very successful blind that is fairly comfortable. You see a bear come it"
												+ "\nis in perfect position for a perfect shot. Your tour guide instructs you to wait a few seconds and slowly prepare for the shot."
												+ "\nThe bear hears a noise and is almost spooked but doesnt move too far and you make the shot. You have successfully killed a bear "
												+ "\nand had a successful hunting trip! Congratulations! You win!");
										System.exit(0);
									}
									if(HuntingBear1a.equalsIgnoreCase("Ground"))
									{
										System.out.println("The ground blind is one of our most exciting and favorite blind. The ground blind lets you truly experiecnce the hunting world"
												+ "\nby being at the same level of the many animals you see. One downside to this blind is you are closer to the animal and more prone to being"
												+ "\nseen by the animal. This could either spook the animal or anger the animal which would result in a very fatal experience. As you are walking to"
												+ "\nthe blind there are animals everywhere and your guide whispers that this is going to be a very good hunt. As you are in the blind you accidently"
												+ "\nsneeze and anger a nearby bear. The bear rushes your blind and mauls you and your tour guide. You loose! The end.");
										System.exit(0);
									}
								}
								if(HuntingBear1.equalsIgnoreCase("No"))
								{
									System.out.println("That is all good, your instructor can give you helpful tips and teach you during your hunting session. Just make"
											+ "\nsure that you are not afraid of guns, shooting, or loud noises!");
									System.out.println("Once you are ready to go, you will be given an option wether to go to the first stand, second stand, or the "
											+ "\nground stand. Please type one of the following: First, Second, Ground.");
									String HuntingBear1ano = key.nextLine();
									if(HuntingBear1ano.equalsIgnoreCase("First"))
									{
										System.out.println("The first blind is a tree stand, you climb up a ladder and sit with your guide. You have alot of bears "
												+ "\naround you and your tour guide is getting a little nervous because they could make the stand fall. Your tour guide "
												+ "\ntells you to shoot your gun so they go away and you can wait until they come back later to hunt them. The gun shot"
												+ "\nstartles the bears and they pull your stand down. You and your tour guide fall and roll down a mountain and die. "
												+ "\nYou have lost the game! The end");
										System.exit(0);										
									}
									if(HuntingBear1ano.equalsIgnoreCase("Second"))
									{
										System.out.println("The second blind is a man made blind that is on stilts 15 feet above the ground. It is not in amazing "
												+ "\ncondition but the tour guide claims but it is  a very successful blind that is fairly comfortable. You see a bear come it"
												+ "\nis in perfect position for a perfect shot. Your tour guide instructs you to wait a few seconds and slowly prepare for the shot."
												+ "\nThe bear hears a noise and is almost spooked but doesnt move too far and you make the shot. You have successfully killed a bear "
												+ "\nand had a successful hunting trip! Congratulations! You win!");
										System.exit(0);
									}
									if(HuntingBear1ano.equalsIgnoreCase("Ground"))
									{
										System.out.println("The ground blind is one of our most exciting and favorite blind. The ground blind lets you truly experiecnce the hunting world"
												+ "\nby being at the same level of the many animals you see. One downside to this blind is you are closer to the animal and more prone to being"
												+ "\nseen by the animal. This could either spook the animal or anger the animal which would result in a very fatal experience. As you are walking to"
												+ "\nthe blind there are animals everywhere and your guide whispers that this is going to be a very good hunt. As you are in the blind you accidently"
												+ "\nsneeze and anger a nearby bear. The bear rushes your blind and mauls you and your tour guide. You loose! The end.");
										System.exit(0);
									}
									
									
									
								}
									
							}
							if(Hunting2.equalsIgnoreCase("Deer"))
							{
								System.out.println("Hello! Welcome " + name + " to Deer hunting. This is a very adventureous and fun hunting experience! Have you "
										+ "\never been hunting before? Yes or no.");
								String HuntingDeer1 = key.nextLine();
								if(HuntingDeer1.equalsIgnoreCase("yes"))
								{
									System.out.println("Perfect! We will not be doing any training and you can get out in the woods in no time! Please make "
											+ "\nsure you follow your tour guides instructions at all times to prevent any injuries.");
									System.out.println("Tour Guide: Welcome to our hunting adventure. Here is where I am going to give you all the supplies"
											+ "\nand information you need to be prepared to go bear hunting with us today. Now you need to make sure you are safe"
											+ "\nat all times. Your tour guides will be carrying your gun at all times but once you are in the stand waiting for"
											+ "\na bear you will be in control of your gun. Since this requires previosu hunting and/or shooting experience we wont"
											+ "\nbe teaching you how to do any of that. You will need to put on camoflauge and face paint so you cannot be seen by any"
											+ "\nanimals.");
									System.out.println("Once you have done that we are ready to go. You will be given a choice wether to go to the first stand, "
											+ "the second stand, or the ground stand. Please type, first, second, or ground to choose.");
									String HuntingDeer1a = key.nextLine();
									if(HuntingDeer1a.equalsIgnoreCase("First"));
									{
										System.out.println("Welcome to the first stand. This stand has a massive corn pile at the end which attracts many deer! You "
												+ "\nare sitting in the stand with your guide and a deer comes out infront of your stand. The guide tells you to get ready"
												+ "\nand counts down from 3. 2. 1. SHOOT! You shoot the deer!"
												+ "\nCongratulations!"
												+ "\nYou have won the hunting deer chapter of the game!");
									}
									if(HuntingDeer1a.equalsIgnoreCase("Second"))
									{
										System.out.println("Welcome to the second blind! This is a blind in the woods about 3 feet high attached to a tree. Here you will"
												+ "\nneed to make sure you are very camoflauge and make sure your only movements are when you are preparing to shoot. "
												+ "\nA deer walks out around 60 yards away and the guide tells you to prepare to shoot it. You get nervous and begin to make alot"
												+ "\nof noise with your feet. This spooks the deer off and you dont get to shoot it. "
												+ "\nBetter luck next time!"
												+ "\nThe end.");
									}
									if(HuntingDeer1a.equalsIgnoreCase("Ground"))
									{
										System.out.println("Welcome to the ground blind for deer hunting! This blind is very easy and low maintence. You only have to be careful with"
												+ "\nwhere you are sitting and stepping. Sometimes there are dangerous snakes and spiders at the bottom of the blind. You are walking into the"
												+ "\nblind and are immediately intimidated by the snake standing at the entrance. You get scared and decide to stop the hunt."
												+ "\nYou have lost the game!"
												+ "\nThe end!");
									}
								}
								if(HuntingDeer1.equalsIgnoreCase("No"))
								{
									System.out.println("That is all good, your instructor can give you helpful tips and teach you during your hunting session. Just make"
											+ "sure that you are not afraid of guns, shooting, or loud noises!");
									System.out.println("Once you are ready to go, you will be given an option wether to go to the first stand, second stand, or the "
											+ "\nground stand. Please type one of the following: First, Second, Ground.");
									String HuntingDeer1noA = key.nextLine();
									
									if(HuntingDeer1noA.equalsIgnoreCase("First"));
									{
										System.out.println("Welcome to the first stand. This stand has a massive corn pile at the end which attracts many deer! You "
												+ "\nare sitting in the stand with your guide and a deer comes out infront of your stand. The guide tells you to get ready"
												+ "\nand counts down from 3. 2. 1. SHOOT! You shoot the deer!"
												+ "\nCongratulations!"
												+ "\nYou have won the hunting deer chapter of the game!");
									}
									if(HuntingDeer1noA.equalsIgnoreCase("Second"))
									{
										System.out.println("Welcome to the second blind! This is a blind in the woods about 3 feet high attached to a tree. Here you will"
												+ "\nneed to make sure you are very camoflauge and make sure your only movements are when you are preparing to shoot. "
												+ "\nA deer walks out around 60 yards away and the guide tells you to prepare to shoot it. You get nervous and begin to make alot"
												+ "\nof noise with your feet. This spooks the deer off and you dont get to shoot it. "
												+ "\nBetter luck next time!"
												+ "\nThe end.");
									}
									if(HuntingDeer1noA.equalsIgnoreCase("Ground"))
									{
										System.out.println("Welcome to the ground blind for deer hunting! This blind is very easy and low maintence. You only have to be careful with"
												+ "\nwhere you are sitting and stepping. Sometimes there are dangerous snakes and spiders at the bottom of the blind. You are walking into the"
												+ "\nblind and are immediately intimidated by the snake standing at the entrance. You get scared and decide to stop the hunt."
												+ "\nYou have lost the game!"
												+ "\nThe end!");
									}
								}
								
							}
							if(Hunting2.equalsIgnoreCase("Elk"))
							{
								System.out.println("Hello! Welcome " + name + " to Elk hunting. This is a very adventureous and fun hunting experience! Have you "
										+ "\never been hunting before? This type of hunting does require prior hunting experience. Yes or no.");
								String HuntingElk1 = key.nextLine();
								if(HuntingElk1.equalsIgnoreCase("No"))
								{
									System.out.println("I am sorry that you dont have any prior hunting experience. Please feel free to try any other types of"
											+ "\nguided hunts!"
											+ "\nGame over!"
											+ "\nThe end!");
								}
								if(HuntingElk1.equalsIgnoreCase("Yes"))
								{
									System.out.println("Yes! I am so excited to guide you on an amazing hunt today! You have three blind options as to which you can"
											+ "\nhunt with your guide. A ground, tree stand or stand.");
									String HuntingElk1a = key.nextLine();
									if(HuntingElk1a.equalsIgnoreCase("ground"))
									{
										System.out.println("I am very excited to guide you to the ground blind today! The ground blind is a great blind and you are mostlikely"
												+ "\ngoing to have a successful hunt! You are sitting in the ground blind with your tour guide and a 100 pound or so elk is standing"
												+ "\ninfront of your blind. Your guide tells you to make the shot and you shoot and miss. The elk goes running away."
												+ "\nYou lost!"
												+ "\nThe end!");
										System.exit(0);
									}
									if(HuntingElk1a.equalsIgnoreCase("tree stand"))
									{
										System.out.println("I am very excited to guide you to the tree stand! This is a great stand but has very little space. You are sitting in the "
												+ "\nstand with your guide. There is an elk within range of your stand and your guide tells you to prepare to shoot it. You shoot at it and"
												+ "\nyou hit it but the elk runs away and you arent able to find it."
												+ "\nYou loose1"
												+ "\nThe end!");
									}
									if(HuntingElk1a.equalsIgnoreCase("stand"))
									{
										System.out.println("Welcome to the stand! This stand is great, it is on stilts around 10 feet off the ground and is fully camoflauge."
												+ "\nAs you and your guide are walking to the stand you notice there is alot of wild life and this could be a successful hunt. You"
												+ "\nare climbing up the stand and an elk walks infront of the stand. your tour guide tells you to be very quiet and to go up the stand."
												+ "\nyou get up the stand and you prepare to shoot the elk. You take the shot and it jumps and runs. You search everywhere for hours and lucky"
												+ "\nenough you find the elk!"
												+ "\nCongratulations!"
												+ "\nYou have won the game!");
										System.exit(0);
									}
								}	
							}		
						}			
					}
					
				}  
		}
		

	


