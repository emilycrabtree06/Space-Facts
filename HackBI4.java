import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.awt.Graphics;

public class HackBI4 extends JComponent{

   private JFrame frame;
   private JLabel header;
   private JLabel givenFact;
   private JPanel controlPanel;
   
   
   public HackBI4() {
      makeFrame();
   }
   
   public static void main(String[] args){
      
      HackBI4 swingControlDemo = new HackBI4();
      swingControlDemo.showButtonDemo();
   
    }
    
   public void makeFrame() {
      
       frame = new JFrame("Choose Your Space Facts!");
       frame.setSize(900,700);
       frame.setBackground(Color.BLUE);
       frame.setLayout(new GridLayout(3, 1));
       frame.addWindowListener(new WindowAdapter() {
        
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
              }
      });
      
       header  = new JLabel("", JLabel.CENTER);
       givenFact = new JLabel("",JLabel.CENTER);
       givenFact.setSize(350,400);
       controlPanel = new JPanel();
       controlPanel.setLayout(new FlowLayout());
       frame.add(header);
       frame.add(controlPanel);
       frame.add(givenFact);
       frame.setVisible(true);
   
   }  
   
      private void showButtonDemo(){
      
      List<String> astronautFacts = new ArrayList<>();
        astronautFacts.add("The word 'astronaut' is Greek and means 'star sailor'");
        astronautFacts.add("John Glenn became the U.S. Senator to becom an astronaut.");
        astronautFacts.add("As of 2020, there have been 15 astronaut and 4 cosmonaut fatalities during spaceflight.");
        astronautFacts.add("As of 1/23/20, there are three astronauts in space"); 
        astronautFacts.add("a variety of animals have been sent into space including ants, cats, frogs, dogs, monkeys, and even jellyfish.");
      
           Random random = new Random();
     String realAstronautFact = astronautFacts.get(random.nextInt(astronautFacts.size()));
     
      List<String> earthFacts = new ArrayList<>();
        earthFacts.add("Earth is the only planet not named after a god.");
        earthFacts.add("The Earth tilts at roughly 66 degrees");
        earthFacts.add("The hottest spot on Earth is in Libya");
        earthFacts.add("Earth is mostly made of Iron, Oxygen and Silicon"); 
        earthFacts.add("Earth is the Only Planet Known to Have Life");
      
    String realEarthFact = earthFacts.get(random.nextInt(earthFacts.size()));
    
     List<String> jupiterFacts = new ArrayList<>();
        jupiterFacts.add("Jupiter has the shortest day of the eight planets.");
        jupiterFacts.add("Jupiter has at least 67 moons in satellite around the planet");
        jupiterFacts.add("Jupiter does not experience seasons like other planets such as Earth and Mars.");
        jupiterFacts.add("Jupiter has a very strong magnetic field"); 
        jupiterFacts.add("Jupiter is the fourth brightest object in our solar system");
      
    String realJupiterFact = jupiterFacts.get(random.nextInt(jupiterFacts.size()));
     List<String> marsFacts = new ArrayList<>();
        marsFacts.add("The planet is named after Mars, the Roman god of war");
        marsFacts.add("Mars was once believed to be home to intelligent life.");
        marsFacts.add("Mars experiences huge dust storms â€“ the largest in our solar system.");
        marsFacts.add("Mars does not have a magnetic field"); 
        marsFacts.add("Only 16 of the 39 Mars missions have been successful");
      
         
    String realMarsFact = marsFacts.get(random.nextInt(marsFacts.size()));
   
       List<String> mercuryFacts = new ArrayList<>();
        mercuryFacts.add("Mercury has been known to humanity since ancient times");
        mercuryFacts.add("A year in Mercury is 88 days, yet a Mercury day is 176 Earth days.");
        mercuryFacts.add("The planet has just 38% of the gravity on Earth.");
        mercuryFacts.add(" Mercury has a large iron core that is around 40% of its volume"); 
        mercuryFacts.add(" Mercury has more craters and impact marks that any other planet.");
      
           
    String realMercuryFact = mercuryFacts.get(random.nextInt(mercuryFacts.size()));

        List<String> neptuneFacts = new ArrayList<>();
        neptuneFacts.add("Neptune was discovered by Jean Joseph Le Verrier");
        neptuneFacts.add(" Neptune is the Roman God of the Sea");
        neptuneFacts.add("The largest Neptunian moon, Triton, was discovered just 17 days after Neptune itself was discovered");
        neptuneFacts.add("   Neptune has an average surface temperature of -214°C"); 
        neptuneFacts.add(" It takes Neptune 164.8 Earth years to orbit the Sun");
      
    String realNeptuneFact = neptuneFacts.get(random.nextInt(neptuneFacts.size()));

   List<String> plutoFacts = new ArrayList<>();
        plutoFacts.add("Pluto was reclassified from a planet to a dwarf planet in 2006.");
        plutoFacts.add("Pluto was discovered on February 18th, 1930 by the Lowell Observatory. ");
        plutoFacts.add("Pluto has five known moons.");
        plutoFacts.add("Pluto is smaller than a number of moons. "); 
        plutoFacts.add("Pluto is one third water.");
      
    String realPlutoFact = plutoFacts.get(random.nextInt(plutoFacts.size()));
   
   List<String> saturnFacts = new ArrayList<>();
        saturnFacts.add("Saturn is one of five planets able to be seen with the naked eye");
        saturnFacts.add(" It takes Saturn 29.4 Earth years to orbit the Sun");
        saturnFacts.add("Saturn has 150 moons and smaller moonlets");
        saturnFacts.add("Saturn is the flattest of the eight planets"); 
        saturnFacts.add("Saturn appears a pale yellow color because its upper atmosphere contains ammonia crystals");
      
    String realSaturnFact = saturnFacts.get(random.nextInt(saturnFacts.size()));
    
    List<String> shipFacts = new ArrayList<>();
        shipFacts.add("ISS flies around the world every 90 minutes(5mps)");
        shipFacts.add("The Space Shuttle 'Discovery' is the most known space shuttle");
        shipFacts.add("The crew on a space shuttle can see a sunrise or sunset on earth every 45 minutes");
        shipFacts.add("The shuttles Heat Sheild contains 30,000+ tiles"); 
        shipFacts.add("People can now make tiktoks from sapce because of advanced technology");
      
    String realShipFact = shipFacts.get(random.nextInt(shipFacts.size()));

   List<String> spaceFacts = new ArrayList<>();
        spaceFacts.add("Space is completely silent.");
        spaceFacts.add("Nobody knows how many stars are in space.");
        spaceFacts.add("A full NASA space suit costs $12,000,000.");
        spaceFacts.add("There may be a planet made out of diamonds. "); 
        spaceFacts.add("There is floating water in space.");
      
    String realSpaceFact = spaceFacts.get(random.nextInt(spaceFacts.size()));
   
   List<String> uranusFacts = new ArrayList<>();
        uranusFacts.add(" Uranus rotates on its axis once every 17 hours and 14 minutes");
        uranusFacts.add(" Uranus wind speeds can reach up to 900 km (about 560mph) per hour ");
        uranusFacts.add(" The chemical element Uranium, discovered in 1789, was named after the newly discovered planet Uranus.");
        uranusFacts.add("  Uranus is often referred to as the ice giant. "); 
        uranusFacts.add("It takes Uranus 84 Earth days to orbit the Sun.");
      
    String realUranusFact = uranusFacts.get(random.nextInt(uranusFacts.size()));
      
         header.setText("Choose a button and get a random sapce fact!!");
         JButton astronaut = new JButton("Astronaut Fact");
         JButton earth = new JButton("Earth Fact");
         JButton jupiter = new JButton("Jupiter Fact");
         JButton mars = new JButton("Mars Fact");
         JButton mercury = new JButton("Mercury Fact");
         JButton neptune = new JButton("Neptune Fact");
         JButton pluto = new JButton("Pluto Fact");
         JButton saturn = new JButton("Saturn Fact");
         JButton ship = new JButton("Space Ship Fact");
         JButton space = new JButton("Space Fact");
         
         JButton uranus = new JButton("Uranus Fact");
         TheAstronautFact astronautFact = new TheAstronautFact();
         astronaut.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about astronauts are: " + realAstronautFact);
            }
         });
         
         earth.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Earth is: " + realEarthFact);
            }
         });

         jupiter.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Jupiter is: " + realJupiterFact);
            }
         });
         
         mars.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Mars is: " + realMarsFact);
            }
         });
         
         mercury.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Mercury is: " + realMercuryFact);
            }
         });
         
         neptune.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Neptune is: " + realNeptuneFact);
            }
         });
         
         pluto.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Pluto is: " + realPlutoFact);
            }
         });
         
         saturn.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Saturn is: " + realSaturnFact);
            }
         });
         
         ship.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Space Ships is: " + realShipFact);
            }
         });

         space.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Space is: " + realSpaceFact);
            }
         });
         
         uranus.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               givenFact.setText("Your random fact about Uranus is: " + realUranusFact);
            }
         });






         
         
         controlPanel.add(astronaut);
         controlPanel.add(earth);
         controlPanel.add(jupiter);
         controlPanel.add(mars);
         controlPanel.add(mercury);
         controlPanel.add(neptune);
         controlPanel.add(pluto);
         controlPanel.add(saturn);
         controlPanel.add(ship);
         controlPanel.add(space);
         controlPanel.add(uranus);
         frame.setVisible(true);
   }
   


}