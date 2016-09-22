/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.jdl.impl;

import io.github.jhipster.jdl.jdl.JdlEntity;
import io.github.jhipster.jdl.jdl.JdlEntityExclusion;
import io.github.jhipster.jdl.jdl.JdlPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Exclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.jdl.impl.JdlEntityExclusionImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JdlEntityExclusionImpl extends MinimalEObjectImpl.Container implements JdlEntityExclusion
{
  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<JdlEntity> entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JdlEntityExclusionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JdlPackage.Literals.JDL_ENTITY_EXCLUSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JdlEntity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectResolvingEList<JdlEntity>(JdlEntity.class, this, JdlPackage.JDL_ENTITY_EXCLUSION__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JdlPackage.JDL_ENTITY_EXCLUSION__ENTITIES:
        return getEntities();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JdlPackage.JDL_ENTITY_EXCLUSION__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends JdlEntity>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JdlPackage.JDL_ENTITY_EXCLUSION__ENTITIES:
        getEntities().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JdlPackage.JDL_ENTITY_EXCLUSION__ENTITIES:
        return entities != null && !entities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JdlEntityExclusionImpl
