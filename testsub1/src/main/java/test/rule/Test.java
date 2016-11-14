/**************************************************************************************** 
           南京国通智能科技有限公司  (优秀是习惯 规范是能力 交付是品德 质量是生命)           
 ****************************************************************************************/
package test.rule;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <Description> <br>
 * 
 * @author Administrator<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年9月26日 <br>
 */

public class Test {

    /**
     * logger
     */
    private static final Log LOGGER = LogFactory.getLog(Test.class);

    /**
     * 
     * Description: test<br> 
     * @author shiming<br>
     * @taskId <br>
     * @param a test
     * @return <br>
     */
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
        if ("111".equals(a1)) {
            System.out.println(s);
        } else if ("222".equals(a1)) {
            System.out.println(s + "11");
        }

    }

    /**
     * Description: <br>
     * 
     * @author shiming<br>
     * @taskId <br>
     * @param args <br>
     * @throws InterruptedException
     */
    public static void main(String[] args) {
        com.alibaba.dubbo.container.Main.main(args);
        // ClassPathXmlApplicationContext context = null;
        // try {
        // context = new ClassPathXmlApplicationContext("classpath:config/spring/root-context.xml");
        // context.start();
        //
        // } catch (Exception e) {
        // LOGGER.error("== DubboProvider context start error:", e);
        // } finally {
        // if (null != context) {
        // context.close();
        // }
        // }
        // LOGGER.info("ttttttttttttttttttt");
        // synchronized (Test.class) {
        // boolean b = true;
        // while (b) {
        // try {
        // Test.class.wait();
        // } catch (InterruptedException e) {
        // LOGGER.error("== synchronized error:", e);
        // throw e;
        // }
        // }
        // }

    }

}
