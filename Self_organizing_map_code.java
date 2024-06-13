/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package som;
import java.util.ArrayList;
import java.util.Random;
//import javax.swing.JOptionPane;
/**
 *
 * @author PHILIP ADEBAYO
 */
public class Som {

    
	// If you look closely, you can see the letters made out of 1's
	private static int BEE[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,0,1,1,0};

	private static int BEETLE[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,0,1,1,0};

	private static int CATERPILLA[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,0,1,0,0,1,1,0};

	private static int ANT[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,0,1,0,0,1,1,0};

	private static int COCKROACH[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,0,1,1,0};

	private static int CRAYFISH[] = {0,1,1,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,1,0,0,0,0,0,1,1,0};

	private static int FLIES[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,0,1,1,0};

	private static int GRASSHOPPER[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,0,1,1,0};

	private static int MOSQUITO[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,0};

	private static int SCORPION[] = {0,1,1,0,1,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,1,1,0,0,0,0,1,1,0};

	private static int SPIDER[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,0,1,1,0,};

	private static int FLEA[] = {0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,0,1,0,0,1,1,0};

	private static int DOLPHIN[] = {1,0,0,1,0,1,0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,1,1,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1};

	private static int JELLYFISH[] = {1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1};

	private static int ASP[] = {1,0,1,0,1,0,0,0,1,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1};

	private static int SALMON[] = {1,0,0,1,0,1,0,0,1,0,1,1,1,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1};

	private static int SARDINE[] = {1,0,0,1,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1};

	private static int SAWFISH[] = {1,0,0,1,0,1,0,1,0,0,1,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1};

	private static int HORSE[] = {1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1};

	private static int SHARK[] = {1,0,1,0,0,1,0,1,0,0,1,0,1,1,0,1,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,0,1};

	private static int WHALE[] = {1,0,0,1,0,1,0,0,1,0,0,0,0,1,0,1,0,0,0,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0};

        private static int EEL[] = {1,0,1,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,0,1,1};

        private static int TILAPIA[] = {1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,0,0,1};

        private static int RAY[] = {1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1};

        private static int CHIMAERA[] = {1,0,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1};

        private static int DOGFISH[] = {1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1};

        private static int CATFISH[] = {1,0,1,0,0,1,0,1,0,0,0,0,1,0,1,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,1,1,0,0,1};

        private static int MACKEREL[] = {1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1};

        private static int TUNA[] = {1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1};

        private static int PYTHON[] = {1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1};

        private static int ADDER[] = {1,0,1,0,1,0,1,0,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};

        private static int ANACONDA[] = {1,0,1,0,1,0,1,0,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1};

        private static int CHAMELEON[] = {1,0,1,0,1,0,1,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1};

        private static int COBRA[] = {1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1};

        private static int COCRODILE[] = {1,0,1,0,1,1,0,0,1,1,1,1,1,0,0,1,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1};

        private static int ALLIGATOR[] = {1,0,1,0,1,1,0,0,1,1,1,1,1,0,0,1,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1};

        private static int TORTOISE[] = {1,0,1,0,1,0,0,0,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1};

        private static int TURTLE[] = {1,0,1,0,1,1,0,0,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1};

        private static int LIZARD[] = {1,0,1,0,1,0,0,0,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1};

        private static int GECKO[] = {1,0,1,0,1,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1};

        private static int FROG[] = {1,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,1,1};

        private static int TOAD[] = {1,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,0,0,0,0,0,0,1,0,0,0,1,1};

        private static int SALAMANDA[] = {1,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,1,1};

       private static int CAECILIAN[] = {1,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,0,0,1,1};

       private static int NEWTS[] = {1,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,1,1};

        private static int MUDPUPPY[] = {1,0,1,0,1,1,0,1,1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,1,1};

        private static int AMPHIUMA[] = {1,0,1,0,1,1,0,1,1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,0,0,1,1};

       private static int OSTRICH[] = {1,0,0,1,1,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,0,1,0,1,0,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,0,0,0,0,0,1};

       private static int PENGUIN[] = {1,0,0,1,1,0,1,1,1,0,1,1,0,0,1,1,0,0,0,0,0,0,1,0,0,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,1,0,0,1};

       private static int EAGLE[] = {1,0,0,1,0,1,0,1,1,0,1,1,0,0,1,0,0,0,0,0,1,0,1,0,0,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,0,0,1};

        private static int BUSTARD[] = {1,0,0,1,1,0,1,0,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,0,0,0,0,0,1};

        private static int PIGEON[] = {1,0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,0,0,0,0,0,1};

        private static int DUCK[] = {1,0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,1,1,0,1,1,0,1,0,1,1,1,0,0,0,0,0,0,1};

       private static int GOOSE[] = {1,0,0,1,1,1,0,0,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,1,1,0,1,0,1,0,1,1,1,0,0,0,0,0,0,1};

        private static int HAWK[] = {1,0,0,1,1,0,1,0,1,1,0,1,1,0,0,1,0,0,0,0,0,1,0,1,0,0,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,0,0,1};

       private static int VULTURE[] = {1,0,0,1,1,0,1,0,1,1,0,1,1,0,0,1,0,0,0,0,0,1,0,1,0,0,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,0,0,1};

        private static int SPARROW[] = {1,0,0,1,1,0,1,0,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,0,0,0,0,0,1};

        private static int OWL[] = {1,0,0,1,1,0,1,0,1,1,0,1,1,0,1,1,0,0,0,0,0,1,0,1,0,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,0,0,0,0,0,1};

        private static int PEACOCK[] = {1,0,0,1,1,0,0,0,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,0,0,0,0,0,1};

        private static int COW[] = {1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};

        private static int DOG[] = {1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,0,0,1,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};

        private static int ELEPHANT[] = {1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};

        private static int GORILLA[] = {1,0,0,1,1,0,1,0,1,1,0,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        private static int ZEBRA[] = {1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};

        private static int RABBIT[] = {1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};

        private static int HUMAN[] = {1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,0,0,1,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        private static int PIG[] = {1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,0,1,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};

        private static int LION[] = {1,0,0,1,1,0,0,0,1,1,0,0,1,0,1,0,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};

        
        private static final int INPUT_UNITS = 46; //input dimensions
	private static final int INPUT_PATTERNS = 68; // sample input
	private static final int OUTPUT_UNITS = 6; /// output nodes
	private static final int VEC_XLEN = 5;
	private static final int VEC_YLEN = 5;
	private static final double DECAY_RATE = 0.96; //reduces the alpha to aid convegence   //About 100 iterations.
	private static final double MIN_ALPHA = 0.01;
	private static final double RADIUS_REDUCTION_POINT = 0.023;     //Last 20% of iterations.

	private static double alpha = 4.0;
	private static double d[] = new double[INPUT_UNITS];           //Network nodes.

	//Weight matrix with randomly chosen values between 0.0 and 1.0
	private static double w[][] = new double[INPUT_UNITS][OUTPUT_UNITS];

	private static ArrayList<int[]> pattern = null;
	private static String names[] = null;

	private static void initialize()
	{
		pattern = new ArrayList<int[]>();
		pattern.add(CATERPILLA);
		pattern.add(CRAYFISH);
		pattern.add(FLIES);
		pattern.add(GRASSHOPPER);
		pattern.add(MOSQUITO);
		pattern.add(SCORPION);
		pattern.add(SPIDER);
		pattern.add(FLEA);
		pattern.add(JELLYFISH);
		pattern.add(SALMON);
		pattern.add(SARDINE);
		pattern.add(SAWFISH);
		pattern.add(WHALE);
		pattern.add(EEL);
		pattern.add(TILAPIA);
		pattern.add(ADDER);
		pattern.add(ALLIGATOR);
		pattern.add(ANACONDA);
		pattern.add(RAY);
		pattern.add(ANT);
		pattern.add(CHIMAERA);
                pattern.add(DOGFISH);
                pattern.add(CATFISH);
                pattern.add(MACKEREL);
                pattern.add(TUNA);
                pattern.add(PYTHON);
                pattern.add(CHAMELEON);
                pattern.add(TORTOISE);
                pattern.add(TURTLE);
                pattern.add(LIZARD);
                pattern.add(GECKO);
                pattern.add(ASP);
                pattern.add(SHARK);
                pattern.add(TOAD);
                pattern.add(SALAMANDA);
                pattern.add(CAECILIAN);
                pattern.add(NEWTS);
                pattern.add(MUDPUPPY);
                pattern.add(AMPHIUMA);
                pattern.add(BEE);
                pattern.add(BEETLE);
                pattern.add(OSTRICH);
                pattern.add(COW);
                pattern.add(PENGUIN);
                pattern.add(BUSTARD);
                pattern.add(PIGEON);
                pattern.add(COCKROACH);
                pattern.add(VULTURE);
                pattern.add(SPARROW);
                pattern.add(COBRA);
                pattern.add(COCRODILE);
                pattern.add(PEACOCK);
                pattern.add(DOG);
                pattern.add(DOLPHIN);
                pattern.add(ZEBRA);
                pattern.add(RABBIT);
                pattern.add(HUMAN);
                pattern.add(DUCK);
                pattern.add(ELEPHANT);
                pattern.add(EAGLE);
                pattern.add(FROG);
                pattern.add(PIG);
                pattern.add(GORILLA);
                pattern.add(GOOSE);
                pattern.add(HAWK);
                pattern.add(HORSE);
                pattern.add(LION);
                pattern.add(OWL);

		names = new String[]{"CATERPILLA","CRAYFISH", "FLIES", "GRASSHOPPER", "MOSQUITO", "SCORPION", "SPIDER", "FLEA", "JELLYFISH",
                                    "SALMON", "SARDINE", "SAWFISH", "WHALE", "EEL", "TILAPIA", "ADDER", "ALLIGATOR", "ANACONDA", "RAY", "ANT",
                                    "CHIMAERA", "DOGFISH", "CATFISH", "MACKEREL", "TUNA", "PYTHON", "CHAMELEON", "TORTOISE", "TURTLE", "LIZARD",
                                    "GECKO", "ASP", "SHARK", "TOAD", "SALAMANDA", "CAECILIAN", "NEWTS", "MUDPUPPY", "AMPHIUMA", "BEE", "BEETLE",
                                    "OSTRICH", "COW", "PENGUIN", "BUSTARD", "PIGEON", "COCKROACH", "VULTURE", "SPARROW", "COBRA", "COCRODILE",
                                    "PEACOCK", "DOG", "DOLPHIN", "ZEBRA", "RABBIT", "HUMAN", "DUCK", "ELEPHANT", "EAGLE", "FROG", "PIG",
                                    "GORILLA", "GOOSE", "HAWK", "HORSE", "LION", "OWL"};
                 
               
		for(int i = 0; i < INPUT_UNITS; i++) // generate random numbres of nodes 6   
		{
			for(int j = 0; j < OUTPUT_UNITS; j++)
			{
				w[i][j] = new Random().nextDouble();
                               // System.out.println(w[i][j]);
			}
		}

		return;
	}

	private static void training()
	{
		int iterations = 0;
	    boolean reductionFlag = false;
	    int reductionPoint = 0;
	    int dMin = 0;

	    while(alpha > MIN_ALPHA) // determines the number of iterations
	    {
	        iterations += 1;

	        for(int vecNum = 0; vecNum <= (INPUT_PATTERNS - 1); vecNum++)
	        {
	            //Compute input for all nodes.
	            computeInput(pattern.get(vecNum));

	            //See which is smaller?
	            dMin = minimum(d);

	            //Update the weights on the winning unit.
	            updateWeights(vecNum, dMin);

	        } // VecNum

	        //Reduce the learning rate.
	        alpha = DECAY_RATE * alpha;

	        //Reduce radius at specified point.
	        if(alpha < RADIUS_REDUCTION_POINT){
	            if(reductionFlag == false){
	                reductionFlag = true;
	                reductionPoint = iterations;
	            }
	        }
	    }

	    System.out.println("Iterations: " + iterations);

	    System.out.println("Neighborhood radius reduced after " + reductionPoint + " iterations.");

		return;
	}

    private static void computeInput(int[] vectorArray) // compute the ecludean distance
	{
		clearArray(d);

	    for(int i = 0; i <= (INPUT_UNITS - 1); i++){
	        for(int j = 0; j <= (OUTPUT_UNITS - 1); j++){
	            d[i] += Math.pow((w[i][j] - vectorArray[j]), 2);
	        } // j
	    } // i
		return;
	}

    private static void updateWeights(int vectorNumber, int dMin)
	{
    	int y = 0;
    	int PointA = 0;
    	int PointB = 0;
    	boolean done = false;

	    for(int i = 0; i < OUTPUT_UNITS; i++)
	    {
	        // Only include neighbors before radius reduction point is reached.
	        if(alpha > RADIUS_REDUCTION_POINT){
	            y = 1;
	            while(!done)
	            {
	                if(y == 1){                                   // Top row of 3.
	                    if(dMin > VEC_XLEN - 1){
	                        PointA = dMin - VEC_XLEN - 1;
	                        PointB = dMin - VEC_XLEN + 1;
	                    }else{
	                        y = 2;
	                    }
	                }
	                if(y == 2){                                   // Middle row of 3.
	                    PointA = dMin - 1;
	                    //DMin is like an anchor position right between these two.
	                    PointB = dMin + 1;
	                }
	                if(y == 3){                                   // Bottom row of 3.
	                    if(dMin < (VEC_XLEN * (VEC_YLEN - 1))){
	                        PointA = dMin + VEC_XLEN - 1;
	                        PointB = dMin + VEC_XLEN + 1;
	                    }else{
	                        done = true;
	                    }
	                }

	                if(!done){
	                    for(int DIndex = PointA; DIndex < PointB; DIndex++)
	                    {
	                        // Check if anchor is at left side.
	                        if(dMin % VEC_XLEN == 0){
	                            // Check if anchor is at top.
	                            if(DIndex > PointA){
	                            	w[DIndex][i] = w[DIndex][i] + (alpha * (pattern.get(vectorNumber)[i] - w[DIndex][i]));
	                            }
	                        // Check if anchor is at right side.
	                        }else if((dMin + 1) % VEC_XLEN == 0){
	                            // Check if anchor is at top.
	                            if(DIndex < PointB){
	                                w[DIndex][i] = w[DIndex][i] + (alpha * (pattern.get(vectorNumber)[i] - w[DIndex][i]));
	                            }
	                        // Otherwise, anchor is not at either side.
	                        }else{
	                            w[DIndex][i] = w[DIndex][i] + (alpha * (pattern.get(vectorNumber)[i] - w[DIndex][i]));
	                        }
	                    } // DIndex
	                }

	                if(y == 3){
	                    done = true;
	                }
	                y += 1; // prepare to start the next row.

	            }
	        }else if(alpha <= RADIUS_REDUCTION_POINT){
	            // Update only the winner.
	            w[dMin][i] = w[dMin][i] + (alpha * (pattern.get(vectorNumber)[i] - w[dMin][i]));
	        }

	    } // i
		return;
	}

    private static void clearArray(double[] nodeArray)
	{
		for(int i = 0; i <= (INPUT_UNITS - 1); i++)
	    {
	        nodeArray[i] = 0.0;
	    } // i
		return;
	}

    private static int minimum(double[] nodeArray)
	{
		int winner = 0;
	    boolean foundNewWinner = false;
	    boolean done = false;

	    while(!done)
	    {
	        foundNewWinner = false;
	        for(int i = 0; i <= (INPUT_UNITS - 1); i++)
	        {
	            if(i != winner){             //Avoid self-comparison.
	                if(nodeArray[i] < nodeArray[winner]){
	                    winner = i;
	                    foundNewWinner = true;
	                }
	            }
	        } // i

	        if(foundNewWinner == false){
	            done = true;
	        }
	    }
	    return winner;
	}

    private static void printResults()
    {
	    //int i = 0;
	    //int j = 0;
	    int dMin = 0;

	    //Print clusters created.
	        System.out.println("Clusters for training input:");
            
	        for(int vecNum = 0; vecNum < INPUT_PATTERNS; vecNum++)
	        {
	            //Compute input.
	            computeInput(pattern.get(vecNum));

	            //See which is smaller.
	            dMin = minimum(d);

	            System.out.print("\nVector (");
	            System.out.print("Pattern " + vecNum + ", " + names[vecNum]);
	            System.out.print(") fits into category " + dMin + "\n");

	        } // VecNum

	    	    }

	public static void main(String[] args)
	{
		initialize();
		training();
		printResults();
		return;
	}

}



    

                        