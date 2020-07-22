package company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
//Wissen Technology
public class ParkingSpacesWissenTech {
	static int minParkingSpaces(int[][] parkingstartendtime) {
		// YOUR CODE HERE
		int start[] = new int[parkingstartendtime.length];

		int end[] = new int[parkingstartendtime.length];
		for (int i = 0; i < parkingstartendtime.length; i++) {
			for (int j = 0; j < parkingstartendtime.length; j++) {
				start[i] = parkingstartendtime[i][0];
				end[i] = parkingstartendtime[i][1];
			}
		}

		int n = start.length;

	

	Arrays.sort(start);
	Arrays.sort(end);

	int parking_needed = 1, result = 1;
	int i = 1, j = 0;while(i<n&&j<n)
	{
		if (start[i] <= end[j]) {
			parking_needed++;
			i++;
		}

		else if (start[i] > end[j]) {
			parking_needed--;
			j++;
		}

		if (parking_needed > result)
			result = parking_needed;

		
	}
	return result;
	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
}