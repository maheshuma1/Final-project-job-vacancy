package UnitTest;

import org.junit.Test;

import com.design.Builder.BuilderDesignPattern;
import com.design.Factory.LoginFactory;
import com.design.Factory.login;
import com.design.SingleTon.SingleTonMain;
import com.design.State.JobPortal;

public class testExecution {

	@Test
	public void stateTest() {
		JobPortal jp = new JobPortal();
		jp.main();
	}
	
	@Test
	public void singleTonTest() {
		SingleTonMain stm = new SingleTonMain();
		stm.main();
	}
	
	@Test
	public void factoryTest() {
		LoginFactory lf = new LoginFactory();
		 login l = lf.getInstance("candidate");
		 l.Type();
	}
	
	@Test
	public void BuilderTest() {
		BuilderDesignPattern bdp = new BuilderDesignPattern();
		bdp.builderpattern();
	}
}