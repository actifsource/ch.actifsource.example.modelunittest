package ch.actifsource.example.modelunittest.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[75aa9c85-9920-11ea-8568-8df113ebd62f,imports]] */
import java.util.ArrayList;
/* End Protected Region   [[75aa9c85-9920-11ea-8568-8df113ebd62f,imports]] */

public class TestFunctionSpace {

  /* Begin Protected Region [[75aa9c85-9920-11ea-8568-8df113ebd62f]] */
  
  /* End Protected Region   [[75aa9c85-9920-11ea-8568-8df113ebd62f]] */


  public static interface IRootFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7b9bc2a6-9920-11ea-8568-8df113ebd62f")
    public List<ch.actifsource.example.modelunittest.generic.javamodel.IChild> getChildsSelector();

    @IDynamicResourceExtension.MethodId("e0c7e0a2-9920-11ea-8568-8df113ebd62f")
    public List<ch.actifsource.example.modelunittest.generic.javamodel.IChild> getChildsJavaFunction();

  }
  
  public static interface IRootFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e0c7e0a2-9920-11ea-8568-8df113ebd62f")
    public List<ch.actifsource.example.modelunittest.generic.javamodel.IChild> getChildsJavaFunction(final ch.actifsource.example.modelunittest.generic.javamodel.IRoot root);

  }
  
  public static class RootFunctionsImpl implements IRootFunctionsImpl {

    public static final IRootFunctionsImpl INSTANCE = new RootFunctionsImpl();

    private RootFunctionsImpl() {}

    @Override
    public List<ch.actifsource.example.modelunittest.generic.javamodel.IChild> getChildsJavaFunction(final ch.actifsource.example.modelunittest.generic.javamodel.IRoot root) {
      /* Begin Protected Region [[e0c7e0a2-9920-11ea-8568-8df113ebd62f]] */
     return new ArrayList<>(root.selectChild());
      /* End Protected Region   [[e0c7e0a2-9920-11ea-8568-8df113ebd62f]] */
    }

  }
  
  public static class RootFunctions {

    private RootFunctions() {}

    public static List<ch.actifsource.example.modelunittest.generic.javamodel.IChild> getChildsJavaFunction(final ch.actifsource.example.modelunittest.generic.javamodel.IRoot root) {
      return DynamicResourceUtil.invoke(IRootFunctionsImpl.class, RootFunctionsImpl.INSTANCE, root).getChildsJavaFunction(root);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,75aa9c85-9920-11ea-8568-8df113ebd62f,ETHCQutvBrSuGrqHHpK2N43SoxU=] */
