

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.padrao.builder.TestCarroBuilder;
import com.padrao.builder.TestPessoaBuilder;

@RunWith(Suite.class)
@SuiteClasses({ TestCarroBuilder.class, TestPessoaBuilder.class })
public class AllTests {

}
