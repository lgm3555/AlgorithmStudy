package level2week1;

public class skilltree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int treeLength = skill_trees.length;

        for (int i=0; i<treeLength; i++) {
            boolean flag = true;
            String[] skills = skill_trees[i].split("");
            int count=0;
            int skillsLen = skills.length;
            for (int j=0; j<skillsLen; j++) {
                if ( count < skill.indexOf(skills[j])) {
                    flag = false;
                    break;
                } else if( count == skill.indexOf(skills[j])) {
                    count++;
                }
            }
            if (flag) {
                answer++;
            }
        }

        return answer;
    }
}
