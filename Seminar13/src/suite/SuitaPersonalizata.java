package suite;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TestGetPromovabilitate;
import categorii.TesteNormale;
import main.TestGrupa;
import main.TestGrupaFake;
import main.TestGrupaStub;


	@RunWith(Suite.class)
	@SuiteClasses({TestGrupaFake.class, TestGrupaStub.class,TestGrupa.class, SuitaCompleta.class})
	@IncludeCategory({TestGetPromovabilitate.class})
	@ExcludeCategory({TesteNormale.class, TesteNormale.class})

	public class SuitaPersonalizata {

	}


