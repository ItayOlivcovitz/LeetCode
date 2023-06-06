import java.util.Arrays;

public class simiularStringGroup
{
    private int[] p;
    private int n, m;

    private int find(int i) {
        if (p[i] < 0)
            return i;
        return (p[i] = find(p[i]));
    }

    private void union(int i, int j) {
        if (find(i) != find(j))
            p[find(i)] = j;
    }

    private boolean cmpStr (char[] a, char[] b) {
        int errors = 0;
        for (int i = 0; i < m; i++)
            errors += a[i] != b[i] ? 1 : 0;
        return errors <= 2;
    }

    public int numSimilarGroups (String[] strs)
    {
        n = strs.length;
        m = strs[0].length();

        p = new int[n];
        Arrays.fill(p, -1);

        char[][] cstrs = new char[n][];
        for (int i = 0; i < n; i++)
            cstrs[i] = strs[i].toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cmpStr(cstrs[i], cstrs[j])) {
                    union(i, j);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++)
            if (p[i] == -1)
                count ++;
        
        return count;
    }
}