package ch.actifsource.example.modelunittest.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Child extends DynamicResource implements IChild {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChild> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChild>() {
    
    @Override
    public IChild create() {
      return new Child();
    }
    
    @Override
    public IChild create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Child(resourceRepository, resource);
    }
  
  };

  public Child() {
    super(IChild.TYPE_ID);
  }
  
  public Child(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IChild.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Child setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4924ddb6-991f-11ea-8568-8df113ebd62f,iQ4FjWNgvX1wUQqDn+tYAfSr5qo=] */
