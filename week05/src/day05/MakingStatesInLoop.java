package day05;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MakingStatesInLoop {

	private static int[] population = { 5_024_279, 733_391, 7_151_502, 3_011_524, 39_538_223, 5_773_714, 3_605_944, 989_948,
			21_538_187, 10_711_908, 1_455_271, 1_839_106, 12_812_508, 6_785_528, 3_190_369, 2_937_880, 4_505_836,
			4_657_757, 1_362_359, 6_177_224, 7_029_917, 10_077_331, 5_706_494, 2_961_279, 6_154_913, 1_084_225,
			1_961_504, 3_104_614, 1_377_529, 9_288_994, 2_117_522, 20_201_249, 10_439_388, 779_094, 11_799_448,
			3_959_353, 4_237_256, 13_002_700, 1_097_379, 5_118_425, 886_667, 6_910_840, 29_145_505, 3_271_616, 643_077,
			8_631_393, 7_705_281, 1_793_716, 5_893_718, 576_851 };

	private static String[] stateNames = { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
			"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
			"Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
			"Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina",
			"North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
			"South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
			"Wisconsin", "Wyoming" };
	
	private static State[] states = new State[50];
	
	static {
		for (int i = 0; i < 50; i++) {
			states[i]= new State(stateNames[i], population[i]);
		}
	}
	
	public static void main(String[] args) {
		// convert array to linked list
		List<State> allStates = new LinkedList<State>();
		allStates.addAll(Arrays.asList(states));
		// sort by population
		Collections.sort(allStates, (state1, state2) -> state2.getPopulation() - state1.getPopulation());
		System.out.println(allStates);
	}
}
