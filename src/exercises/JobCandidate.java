package exercises;

import java.util.Arrays;

/* 
 * 1. Make the JobCandidate class implement Comparable.  
 * 2. Add a JobCandadate instance that represents yourself, and use compareTo() to see who should be given the job.
 * 
 */

import java.util.List;

public class JobCandidate implements Comparable<JobCandidate>{

	private List<String> personalityTraits;
	private int hoursSpentCoding;
	private String teacherName;
	private int salaryRequired;

	public JobCandidate(List<String> personalityTraits, int hoursSpentCoding, String teacherName, int salaryRequired) {
		super();
		this.personalityTraits = personalityTraits;
		this.hoursSpentCoding = hoursSpentCoding;
		this.teacherName = teacherName;
		this.salaryRequired = salaryRequired;
	}

	public static void main(String[] args) {

		JobCandidate june = new JobCandidate(Arrays.asList(new String[] { "adaptable", "scatty", "curious" }), 1200,
				"Vinny Wade", 1200000);
		JobCandidate vlada = new JobCandidate(Arrays.asList(new String[] { "open", "fair", "humorous" }), 700,
				"Joon Spoon", 1200);

		if (june.compareTo(vlada)==1) {
			System.out.println("June is better job candidate");
		}else if(june.compareTo(vlada)==-1){
			System.out.println("Vlada is better job candidate.");
		}else {
			System.out.println("They are equal. Use random to choose your candidate");
		}



	}

	@Override
	public int compareTo(JobCandidate other) {
		
		return Integer.compare(this.hoursSpentCoding, other.hoursSpentCoding);
	}
}