package ch.actifsource.example.modelunittest.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoot extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("454dbde0-991f-11ea-8568-8df113ebd62f");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.modelunittest.generic.javamodel.IChild> selectChild();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,454dbde0-991f-11ea-8568-8df113ebd62f,Q7x/MaLBTcx75SrlZVSgLKeSZHg=] */
