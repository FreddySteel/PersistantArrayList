import java.util.ArrayList; // import the ArrayList class

public class CreateArrayList {
    public static ArrayList xyz(){

        int[] data = {
                1287, 1366, 1669, 1724, 1338, 1560, 1328, 1886, 1514, 1863,
                1876, 1732, 1544, 1547, 1622, 1891, 1453, 1936, 178, 1398,
                1454, 1482, 1585, 1625, 1748, 1888, 1723, 717, 1301, 1840,
                1930, 1314, 1458, 1952, 1520, 1994, 1924, 1873, 1283, 1036,
                2005, 1987, 1973, 1926, 335, 1316, 1241, 1611, 1593, 1754,
                1254, 1768, 1824, 1752, 1559, 1221, 1855, 1907, 1917, 1975,
                1782, 1966, 1395, 1681, 1236, 1572, 437, 1294, 1614, 1549,
                1769, 1963, 1953, 1708, 1382, 1920, 1884, 1841, 1055, 1799,
                1818, 1902, 1541, 1830, 1817, 1939, 1311, 1157, 1997, 1269,
                2000, 1573, 1898, 1467, 1929, 1530, 1336, 1599, 1860, 1455
        };
        ArrayList<Integer> dataList = new ArrayList<Integer>();// Create an ArrayList object
        for (int i = 0; i < data.length; i++) {
            Integer value = data[i];
            dataList.add(value);
        }
        return dataList;

    }
}