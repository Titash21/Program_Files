import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by TITASH MANDAL on 4/3/2017.
 */
public class lambdaWeightedSchedulerTwo{
    // This method uses dynamic programming to sort the lisit of jobs but the time complexity is O(n^2)
    private final List<Jobs> joblist;

    public lambdaWeightedSchedulerTwo(List<Jobs> jobs) {
        joblist = jobs;
    }
    public int maxiumumProfit(){
        List<Integer> weights=new ArrayList<>();
        if(!joblist.isEmpty()){
            sortJobsWithEndTime();
        }else{
            weights.add(0);
            return 0;
        }

        weights.add(joblist.get(0).getWeight());
        for(int i=1;i<joblist.size();i++){

            weights.add(Math.max(joblist.get(i).getWeight(),weights.get(i-1)));
            for(int j=i-1;j>=0;j--){
                if(joblist.get(j).getEndTime()<=joblist.get(i).getStartTime()){
                    weights.add(Math.max((weights.get(i)),(weights.get(j)+joblist.get(i).getWeight())));
                    break;
                }
            }
        }
        Collections.sort(weights);
      return(weights.get(weights.size()-1));

    }
    public  void sortJobsWithEndTime(){

        Collections.sort(joblist, new Comparator<Jobs>() {
            public int compare(Jobs o1, Jobs o2) {
                if(o2.getEndTime()<=o1.getEndTime()){
                    return 1;
                }else{
                    return -1;
                }
            }

        });
    }

}
