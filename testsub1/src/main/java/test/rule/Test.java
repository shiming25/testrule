/**************************************************************************************** 
           南京国通智能科技有限公司  (优秀是习惯 规范是能力 交付是品德 质量是生命)           
 ****************************************************************************************/
package test.rule;

/**
 * <Description> <br>
 * 
 * @author Administrator<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年9月26日 <br>
 */

public class Test {

    public String test1(String a) {
        return a + "1";
    }

    /**
     * Description: <br>
     * 
     * @author Administrator<br>
     * @taskId <br>
     * @param a 1
     * @return <br>
     */
    public String test2(String a) {
        return a + "11";
    }

    /**
     * Description: <br>
     * 
     * @author Administrator<br>
     * @taskId <br>
     *         <br>
     */
    public void test3() {
        String a1 = "1";
        String s = "";
        s = "1";
        if (a1.equals("111")) {
            a1 = s;
        } else if (a1.equals("222")) {
            a1 = s;
        }
    }

    /**
     * Description: <br>
     * 
     * @author Administrator<br>
     * @taskId <br>
     * @param args <br>
     */
    public static void main(String[] args) {

    }

}
