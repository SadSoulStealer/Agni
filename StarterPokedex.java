// The "StarterPokedex" class
// Purpose: To obtain details of pokemon
import javax.swing.*;
public class StarterPokedex {

    public static void main(String[] args) {

	String choice, desc=null, pokemon=null, searchBy=null, region=null, type=null, pokeNo=null, species=null, habitat=null; 

	choice = JOptionPane.showInputDialog(null, "Do you know the name of the Pokemon you are looking for? (Yes/No)", "Welcome to the Pokedex!", 3); 
	if (choice.equalsIgnoreCase("yes")) {
	    pokemon = JOptionPane.showInputDialog(null, "Enter the name of the Pokemon: ", "Welcome to the Pokedex!", JOptionPane.PLAIN_MESSAGE); }
	else if (choice.equalsIgnoreCase("no")) {
	    searchBy = JOptionPane.showInputDialog(null, "Search by: 'type' or 'region'?", "Welcome to the Pokedex!", 3);

		if (searchBy.equalsIgnoreCase("type")) {
		    type = JOptionPane.showInputDialog(null, "Enter pokemon type: (Fire/Water/Grass/Electric/Dark/Normal/Flying/Bug/Poison/Fairy/Psychic)", "Welcome to the Pokedex!", JOptionPane.PLAIN_MESSAGE);
  
			     if (type.equalsIgnoreCase("Fire")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are fire-type: \n\nCharmander \nCharmeleon \nCharizard \nCyndaquil \nQuilava \nTyphlosion \nTorchic \nChimchar \nTepig \nFennekin \n\nWhich Pokemon would you like to search?", "Fire-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Water")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are water-type: \n\nSquirtle \nWartortle \nBlastoise \nTotodile \nCroconaw \nFeraligator \nChinchou \nLanturn \nMudkip \nPiplup \nOshawott \nFroakie \n\nWhich Pokemon would you like to search?", "Water-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Grass")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are grass-type: \n\nBulbasaur \nIvysaur \nVenusaur \nCaterpie \nMetapod \nChikorita \nBayleaf \nMeganium \nBellossom \nTreecko \nTurtwig \nSnivy \nChespin \n\nWhich Pokemon would you like to search?", "Grass-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Electric")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are electric-type: \n\nChinchou \nLanturn \nPichu \nMareep \nFlaffy \nAmpharos \n\nWhich Pokemon would you like to search?", "Electric-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Dark")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are dark-type: \n\n \n\nWhich Pokemon would you like to search?", "Dark-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Normal")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are normal-type: \n\nSentret \nFurret \nHoothoot \nIgglypuff \n\nWhich Pokemon would you like to search?", "Normal-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Flying")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are flying-type: \n\nCharizard \nHoothoot \nNoctowl \nLedyba \nLedian \nCrobat \nTogetic \nNatu \nXatu \n\nWhich Pokemon would you like to search?", "Flying-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Bug")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are bug-type: \n\nCaterpie \nMetapod \nLedyba \nLedian \nSpinarak \nAriados \n\nWhich Pokemon would you like to search?", "Bug-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Poison")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are poison-type: \n\nBulbasaur \nIvysaur \nVenusaur \nSpinarak \nAriados \nCrobat \n\nWhich Pokemon would you like to search?", "Poison-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Fairy")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are fairy-type: \n\nCleffa \nIgglypuff \nTogepi \nTogetic \n\nWhich Pokemon would you like to search?", "Fairy-type Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (type.equalsIgnoreCase("Psychic")) {
			pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are psychic-type: \n\nNatu \nXatu \n\nWhich Pokemon would you like to search?", "Psychic-type Pokemon", JOptionPane.PLAIN_MESSAGE); }


			
			else {
			JOptionPane.showMessageDialog(null, "You entered an invalid keyword. Try again.", "Error!", 1); }
		    }


		else if (searchBy.equalsIgnoreCase("region")) {
		    region = JOptionPane.showInputDialog(null, "Enter region: (Kanto/Johto/Hoenn/Sinnoh/Unova/Kalos)", "Welcome to the Starter Pokedex!", JOptionPane.PLAIN_MESSAGE); 
		    
			     if (region.equalsIgnoreCase("Kanto")) {
			    pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are from the Kanto region: \n\nBulbasaur n\nIvysaur \nVenusaur \nCharmander \nCharmeleon \nCharizard \nSquirtle \nWartortle \nBlastoise \nCaterpie \nMetapod \n\nWhich Pokemon would you like to search?", "Kanto Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (region.equalsIgnoreCase("Johto")) {
			    pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are from the Johto region: \n\nChikorita \nBayleaf \nMeganium \nCyndaquil \nQuilava \nTyphlosion \nTotodile \nCroconaw \nFeraligator \nSentret \nFurret \nHoothoot \nNoctowl \nLedyba \nLedian \nSpinarak \nAriados \nCrobat \nChinchou \nLanturn \nPichu \nCleffa \nIgglypuff \nTogepi \nTogetic \nNatu \nXatu \nMareep \nFlaffy \nAmpharos \nBellossom \n\nWhich Pokemon would you like to search?", "Johto Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (region.equalsIgnoreCase("Hoenn")) {
			    pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are from the Hoenn region: \n\nTreecko \nTorchic \nMudkip \n\nWhich Pokemon would you like to search?", "Hoenn Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (region.equalsIgnoreCase("Sinnoh")) {
			    pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are from the Sinnoh region: \n\nTurtwig \nChimchar \nPiplup \n\nWhich Pokemon would you like to search?", "Sinnoh Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (region.equalsIgnoreCase("Unova")) {
			    pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are from the Unova region: \n\nSnivy \nTepig \nOshawott \n\nWhich Pokemon would you like to search?", "Unova Pokemon", JOptionPane.PLAIN_MESSAGE); }
			else if (region.equalsIgnoreCase("Kalos")) {
			    pokemon = JOptionPane.showInputDialog(null, "Here are the list of Pokemon that are from the Kalos region: \n\nChespin \nFennekin \nFroakie \n\nWhich Pokemon would you like to search?", "Kalos Pokemon", JOptionPane.PLAIN_MESSAGE); }

			else {
			JOptionPane.showMessageDialog(null, "You entered an invalid keyword. Try again.", "Error!", 1); }

		}

	    else {
		JOptionPane.showMessageDialog(null,"You entered an invalid keyword. Try again.", "Error!", 1); }

	}

	else
	    JOptionPane.showMessageDialog(null,"You entered an invalid keyword. Try again.", "Error!", 1);


	if (pokemon.equalsIgnoreCase ("Bulbasaur"))
	{
	    region = "Kanto";
	    pokeNo = "001";
	    species = "Seed";
	    type = "Grass";
	    habitat = "Grassland";
	    desc = "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokémon.";
	}

	else if (pokemon.equalsIgnoreCase ("Ivysaur"))
	{
	    region = "Kanto";
	    pokeNo = "002";
	    species = "Seed";
	    type = "Grass/Posion";
	    habitat = "Grassland";
	    desc = "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.";
	}

	else if (pokemon.equalsIgnoreCase ("Venusaur"))
	{
	    region = "Kanto";
	    pokeNo = "003";
	    species = "Seed";
	    type = "Grass/Posion";
	    habitat = "Grassland";
	    desc = "A bewitching aroma wafts from its flower. The fragrance becalms those engaged in a battle.";
	}

	else if (pokemon.equalsIgnoreCase ("Charmander"))
	{
	    region = "Kanto";
	    pokeNo = "004";
	    species = "Lizard";
	    type = "Fire";
	    habitat = "Mountain";
	    desc = "Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.";
	}
	
	else if (pokemon.equalsIgnoreCase ("Charmeleon"))
	{
	    region = "Kanto";
	    pokeNo = "005";
	    species = "Flame";
	    type = "Fire";
	    habitat = "Mountain";
	    desc = "Tough fights could excite this Pokémon. When excited, it may blow out bluish-white flames.";
	}

	else if (pokemon.equalsIgnoreCase ("Charizard"))
	{
	    region = "Kanto";
	    pokeNo = "006";
	    species = "Flame";
	    type = "Fire/Flying";
	    habitat = "Mountain";
	    desc = "It spits fire that is hot enough to melt boulders. It may cause forest fires by blowing flames.";
	}

	else if (pokemon.equalsIgnoreCase ("Squirtle"))
	{
	    region = "Kanto";
	    pokeNo = "007";
	    species = "Tiny turtle";
	    type = "Water";
	    habitat = "Water's-edge";
	    desc = "After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.";
	}

	else if (pokemon.equalsIgnoreCase ("Wartortle"))
	{
	    region = "Kanto";
	    pokeNo = "008";
	    species = "Turtle";
	    type = "Water";
	    habitat = "Water's-edge";
	    desc = "When tapped, this Pokémon will pull in its head, but its tail will still stick out a little bit.";
	}

	else if (pokemon.equalsIgnoreCase ("Blastoise"))
	{
	    region = "Kanto";
	    pokeNo = "009";
	    species = "Shellfish";
	    type = "Water";
	    habitat = "Freshwater ponds and lakes";
	    desc = "A brutal Pokémon with pressurized water jets on its shell. They are used for high speed tackles.";
	}

	else if (pokemon.equalsIgnoreCase ("Caterpie")) 
	{
	    region = "Kanto";
	    pokeNo = "010";
	    species = "Worm";
	    type = "Bug";
	    habitat = "Forest";
	    desc = "If you touch the feeler on top of its head, it will release a horrible stink to protect itself.";
	}

	else if (pokemon.equalsIgnoreCase ("Metapod")) 
	{
	    region = "Kanto";
	    pokeNo = "011";
	    species = "Cocoon";
	    type = "Bug";
	    habitat = "Forest";
	    desc = "Hardens its shell to protect itself. However, a large impact may cause it to pop out of its shell.";
	}

	else if (pokemon.equalsIgnoreCase("Chikorita")) 
	{
	    region="Johto";
	    pokeNo="152";
	    species="Leaf";
	    type="Grass";
	    habitat="Grassland";
	    desc="A sweet aroma gently wafts from the leaf on its head. It is docile and loves to soak up the sun's rays.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Bayleaf")) 
	{
	    region="Johto";
	    pokeNo="153";
	    species="Leaf";
	    type="Grass";
	    habitat="Grassland";
	    desc="The scent of spices comes from around its neck. Somehow, sniffing it makes you want to fight.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Meganium")) 
	{
	    region="Johto";
	    pokeNo="154";
	    species="Herb";
	    type="Grass";
	    habitat="Grassland";
	    desc="The aroma that rises from its petals contains a substance that calms aggressive feelings.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Cyndaquil")) 
	{
	    region="Johto";
	    pokeNo="155";
	    species="Fire Mouse";
	    type="Fire";
	    habitat="Grassland";
	    desc="It is timid, and always curls itself up in a ball. If attacked, it flares up its back for protection.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Quilava")) 
	{
	    region="Johto";
	    pokeNo="156";
	    species="Volcano";
	    type="Fire";
	    habitat="Grassland";
	    desc="Be careful if it turns its back during battle. It means that it will attack with the fire on its back.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Typhlosion")) 
	{
	    region="Johto";
	    pokeNo="157";
	    species="Volcano";
	    type="Fire";
	    habitat="Grassland";
	    desc="It has a secret, devastating move. It rubs its blazing fur together to cause huge explosions.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Totodile")) 
	{
	    region="Johto";
	    pokeNo="158";
	    species="Big Jaw";
	    type="Water";
	    habitat="Water's-edge";
	    desc="Its well-developed jaws are powerful and capable of crushing anything. Even its trainer must be careful.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Croconaw")) 
	{
	    region="Johto";
	    pokeNo="159";
	    species="Big Jaw";
	    type="Water";
	    habitat="Water's-edge";
	    desc="It opens its huge jaws wide when attacking. If it loses any fangs while biting, they grow back in.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Feraligator")) 
	{
	    region="Johto";
	    pokeNo="160";
	    species="Big Jaw";
	    type="Water";
	    habitat="Water's-edge";
	    desc="When it bites with its massive and powerful jaws, it shakes its head and savagely tears its victim up.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Sentret")) 
	{
	    region="Johto";
	    pokeNo="161";
	    species="Scout";
	    type="Normal";
	    habitat="Grassland";
	    desc="A very cautious Pokémon, it raises itself up using its tail to get a better view of its surroundings.";
	}
	    
	else if (pokemon.equalsIgnoreCase("Furret")) 
	{
	    region="Johto";
	    pokeNo="162";
	    species="Long Body";
	    type="Normal";
	    habitat="Grassland";
	    desc="It makes a nest to suit its long and skinny body. The nest is impossible for other Pokémon to enter.";
	}
	
	else if (pokemon.equalsIgnoreCase("Hoothoot")) 
	{
	    region="Johto";
	    pokeNo="163";
	    species="Owl";
	    type="Normal/Flying";
	    habitat="Forest";
	    desc="It always stands on one foot. It changes feet so fast, the movement can rarely be seen.";
	}
	
	else if (pokemon.equalsIgnoreCase("Noctowl")) 
	{
	    region="Johto";
	    pokeNo="164";
	    species="Owl";
	    type="Normal/Flying";
	    habitat="Forest";
	    desc="When it needs to think, it rotates its head 180 degrees to sharpen its intellectual power.";
	}
	
	else if (pokemon.equalsIgnoreCase("Ledyba")) 
	{
	    region="Johto";
	    pokeNo="165";
	    species="Five Star";
	    type="Bug/Flying";
	    habitat="Forest";
	    desc="It is timid and clusters together with others. The fluid secreted by its feet indicates its location.";
	}
	
	else if (pokemon.equalsIgnoreCase("Ledian")) 
	{
	    region="Johto";
	    pokeNo="166";
	    species="Five Star";
	    type="Bug/Flying";
	    habitat="Forest";
	    desc="When the stars flicker in the night sky, it flutters about, scattering a glowing powder.";
	}
	
	else if (pokemon.equalsIgnoreCase("Spinarak")) 
	{
	    region="Johto";
	    pokeNo="167";
	    species="String Spit";
	    type="Bug/Poison";
	    habitat="Forest";
	    desc="It lies still in the same pose for days in its web, waiting for its unsuspecting prey to wander close.";
	}
	
	else if (pokemon.equalsIgnoreCase("Ariados")) 
	{
	    region="Johto";
	    pokeNo="168";
	    species="Long Leg";
	    type="Bug/Poison";
	    habitat="Forest";
	    desc="It spins string not only from its rear but also from its mouth. It is hard to tell which end is which.";
	}
	
	else if (pokemon.equalsIgnoreCase("Crobat")) 
	{
	    region="Johto";
	    pokeNo="169";
	    species="Bat";
	    type="Poison/Flying";
	    habitat="Cave";
	    desc="The development of wings on its legs enables it to fly fast but also makes it tough to stop and rest.";
	}
	
	else if (pokemon.equalsIgnoreCase("Chinchou")) 
	{
	    region="Johto";
	    pokeNo="170";
	    species="Angler";
	    type="Water/Electric";
	    habitat="Ocean";
	    desc="It shoots positive and negative electricity between the tips of its two antennae and zaps its enemies.";
	}
	
	else if (pokemon.equalsIgnoreCase("Lanturn")) 
	{
	    region="Johto";
	    pokeNo="171";
	    species="Light";
	    type="Water/Electric";
	    habitat="Ocean";
	    desc="This Pokémon uses the bright part of its body, which changed from a dorsal fin, to lure prey.";
	}
	
	else if (pokemon.equalsIgnoreCase("Pichu")) 
	{
	    region="Johto";
	    pokeNo="172";
	    species="Tiny Mouse";
	    type="Electric";
	    habitat="Forest";
	    desc="The electric sacs in its cheeks are small. If even a little electricity leaks, it becomes shocked.";
	}
	
	else if (pokemon.equalsIgnoreCase("Cleffa")) 
	{
	    region="Johto";
	    pokeNo="173";
	    species="Star Shaped";
	    type="Fairy";
	    habitat="Mountain";
	    desc="Because of its unusual, starlike silhouette, people believe that it came here on a meteor.";
	}
	
	else if (pokemon.equalsIgnoreCase("Igglypuff")) 
	{
	    region="Johto";
	    pokeNo="174";
	    species="Balloon";
	    type="Normal/Fairy";
	    habitat="Grassland";
	    desc="Its extremely flexible and elastic body makes it bounce continuously — anytime,anywhere.";
	}
	
	else if (pokemon.equalsIgnoreCase("Togepi")) 
	{
	    region="Johto";
	    pokeNo="175";
	    species="Spike Ball";
	    type="Fairy";
	    habitat="Forest";
	    desc="A proverb claims that happiness will come to anyone who can make a sleeping Togepi stand up.";
	}
	
	else if (pokemon.equalsIgnoreCase("Togetic")) 
	{
	    region="Johto";
	    pokeNo="176";
	    species="Happiness";
	    type="Fairy/Flying";
	    habitat="Forest";
	    desc="Although it does not flap its wings very much, it can stay up in the air as it tags along after its trainer.";
	}
	
	else if (pokemon.equalsIgnoreCase("Natu")) 
	{
	    region="Johto";
	    pokeNo="177";
	    species="Tiny Bird";
	    type="Psychic/Flying";
	    habitat="Forest";
	    desc="Because its wings aren't yet fully grown, it has to hop to get around. It is always staring at something.";
	}
	
	else if (pokemon.equalsIgnoreCase("Xatu")) 
	{
	    region="Johto";
	    pokeNo="178";
	    species="Mystic";
	    type="Psychic/Flying";
	    habitat="Forest";
	    desc="Once it begins to meditate at sunrise, the entire day will pass before it will move again.";
	}
	
	else if (pokemon.equalsIgnoreCase("Mareep")) 
	{
	    region="Johto";
	    pokeNo="179";
	    species="Wool";
	    type="Electric";
	    habitat="Grassland";
	    desc="Its fleece grows continually. In the summer, the fleece is fully shed, but it grows back in a week.";
	}
	
	else if (pokemon.equalsIgnoreCase("Flaffy")) 
	{
	    region="Johto";
	    pokeNo="180";
	    species="Wool";
	    type="Electric";
	    habitat="Grassland";
	    desc="If its coat becomes fully charged with electricity, its tail lights up. It fires hair that zaps on impact.";
	}
	
	else if (pokemon.equalsIgnoreCase("Ampharos")) 
	{
	    region="Johto";
	    pokeNo="181";
	    species="Light";
	    type="Electric";
	    habitat="Grassland";
	    desc="The tail's tip shines brightly and can be seen from far away. It acts like a beacon for lost people.";
	}
	
	else if (pokemon.equalsIgnoreCase("Bellossom")) 
	{
	    region="Johto";
	    pokeNo="182";
	    species="Flower";
	    type="Grass";
	    habitat="Grassland";
	    desc="Plentiful in the tropics. When it dances, its petals rub together and make a pleasant ringing sound.";
	}
	
	else if (pokemon.equalsIgnoreCase("Bellossom")) 
	{
	    region="Johto";
	    pokeNo="182";
	    species="Flower";
	    type="Grass";
	    habitat="Grassland";
	    desc="Plentiful in the tropics. When it dances, its petals rub together and make a pleasant ringing sound.";
	}

	else if (pokemon.equalsIgnoreCase("Treecko")) 
	{
	    region="Hoenn";
	    pokeNo="252";
	    species="Wood Gecko";
	    type="Grass";
	    habitat="Forest";
	    desc="Its well-developed jaws are powerful and capable of crushing anything. Even its trainer must be careful.";
	}

	else if (pokemon.equalsIgnoreCase("Torchic")) 
	{
	    region="Hoenn";
	    pokeNo="255";
	    species="Chick";
	    type="Fire";
	    habitat="Grassland";
	    desc="A fire burns inside, so it feels very warm to hug. It launches fireballs of 1,800 degrees F.";
	}

	else if (pokemon.equalsIgnoreCase("Mudkip")) 
	{
	    region="Hoenn";
	    pokeNo="258";
	    species="Mud Fish";
	    type="Water";
	    habitat="Water's-edge";
	    desc="The fin on MUDKIP's head acts as highly sensitive radar. Using this fin to sense movements of water and air, this POKÉMON can determine what is taking place around it without using its eyes.";
	}

	else if (pokemon.equalsIgnoreCase("Turtwig")) 
	{
	    region="Sinnoh";
	    pokeNo="387";
	    species="Tiny Leaf";
	    type="Grass";
	    habitat="Lake-side";
	    desc="It undertakes photosynthesis with its body, making oxygen. The leaf on its head wilts if it is thirsty.";
	}

	else if (pokemon.equalsIgnoreCase("Chimchar")) 
	{
	    region="Sinnoh";
	    pokeNo="390";
	    species="Chimp";
	    type="Fire";
	    habitat="Mountain";
	    desc="Its fiery rear end is fueled by gas made in its belly. Even rain can't extinguish the fire.";
	}

	else if (pokemon.equalsIgnoreCase("Piplup")) 
	{
	    region="Sinnoh";
	    pokeNo="393";
	    species="Penguin";
	    type="Water";
	    habitat="Arctic";
	    desc="A poor walker, it often falls down. However, its strong pride makes it puff up its chest without a care.";
	}

	else if (pokemon.equalsIgnoreCase("Snivy")) 
	{
	    region="Unova";
	    pokeNo="495";
	    species="Grass Snake";
	    type="Grass";
	    habitat="Forest";
	    desc="It is very intelligent and calm. Being exposed to lots of sunlight makes its movements swifter.";
	}

	else if (pokemon.equalsIgnoreCase("Tepig")) 
	{
	    region="Unova";
	    pokeNo="498";
	    species="Fire Pig";
	    type="Fire";
	    habitat="Grassland";
	    desc="It can deftly dodge its foe's attacks while shooting fireballs from its nose. It roasts berries before it eats them.";
	}

	else if (pokemon.equalsIgnoreCase("Oshawott")) 
	{
	    region="Unova";
	    pokeNo="501";
	    species="Sea Otter";
	    type="Water";
	    habitat="Unknown";
	    desc="The scalchop on its stomach isn't just used for battle - it can be used to break open hard berries as well.";
	}

	else if (pokemon.equalsIgnoreCase("Chespin"))
	{
	    region="Kalos";
	    pokeNo="650";
	    species="Spiny Nut";
	    type="Grass";
	    habitat="Grassland";
	    desc="The quills on its head are usually soft. When it flexes them, the points become so hard and sharp that they can pierce rock.";
	}

	else if (pokemon.equalsIgnoreCase("Fennekin"))
	{
	    region="Kalos";
	    pokeNo="653";
	    species="Fox";
	    type="Fire";
	    habitat="Mountain";
	    desc="Eating a twig fills it with energy, and its roomy ears give vent to air hotter than 390 degrees Fahrenheit.";
	}

	else if (pokemon.equalsIgnoreCase("Froakie")) 
	{
	    region="Kalos";
	    pokeNo="656";
	    species="Foam Frog";
	    type="Water";
	    habitat="Water";
	    desc="It secretes flexible bubbles from its chest and back. The bubbles reduce the damage it would otherwise take when attacked.";
	}
	    


	else {
	    JOptionPane.showMessageDialog(null, "No such Pokemon exists. Try again."); }

	JOptionPane.showMessageDialog(null, "Pokemon: " + pokemon + "\nRegion: " + region + "\nNational Pokemon #: " + pokeNo + "\nSpecies: " + species + "\nType: " + type + "\nHabitat: " + habitat + "\nDescription: " + desc, "Pokedex Results", 1);


	}

    }

