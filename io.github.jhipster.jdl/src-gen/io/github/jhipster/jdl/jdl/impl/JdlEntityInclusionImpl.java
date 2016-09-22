/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.jdl.impl;

import io.github.jhipster.jdl.jdl.JdlEntity;
import io.github.jhipster.jdl.jdl.JdlEntityInclusion;
import io.github.jhipster.jdl.jdl.JdlPackage;
import io.github.jhipster.jdl.jdl.JdlWildcardPredicate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.jdl.impl.JdlEntityInclusionImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.jdl.impl.JdlEntityInclusionImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JdlEntityInclusionImpl extends MinimalEObjectImpl.Container implements JdlEntityInclusion
{
  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected JdlWildcardPredicate predicate;

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
  protected JdlEntityInclusionImpl()
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
    return JdlPackage.Literals.JDL_ENTITY_INCLUSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JdlWildcardPredicate getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicate(JdlWildcardPredicate newPredicate, NotificationChain msgs)
  {
    JdlWildcardPredicate oldPredicate = predicate;
    predicate = newPredicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdlPackage.JDL_ENTITY_INCLUSION__PREDICATE, oldPredicate, newPredicate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicate(JdlWildcardPredicate newPredicate)
  {
    if (newPredicate != predicate)
    {
      NotificationChain msgs = null;
      if (predicate != null)
        msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdlPackage.JDL_ENTITY_INCLUSION__PREDICATE, null, msgs);
      if (newPredicate != null)
        msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdlPackage.JDL_ENTITY_INCLUSION__PREDICATE, null, msgs);
      msgs = basicSetPredicate(newPredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.JDL_ENTITY_INCLUSION__PREDICATE, newPredicate, newPredicate));
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
      entities = new EObjectResolvingEList<JdlEntity>(JdlEntity.class, this, JdlPackage.JDL_ENTITY_INCLUSION__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JdlPackage.JDL_ENTITY_INCLUSION__PREDICATE:
        return basicSetPredicate(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case JdlPackage.JDL_ENTITY_INCLUSION__PREDICATE:
        return getPredicate();
      case JdlPackage.JDL_ENTITY_INCLUSION__ENTITIES:
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
      case JdlPackage.JDL_ENTITY_INCLUSION__PREDICATE:
        setPredicate((JdlWildcardPredicate)newValue);
        return;
      case JdlPackage.JDL_ENTITY_INCLUSION__ENTITIES:
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
      case JdlPackage.JDL_ENTITY_INCLUSION__PREDICATE:
        setPredicate((JdlWildcardPredicate)null);
        return;
      case JdlPackage.JDL_ENTITY_INCLUSION__ENTITIES:
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
      case JdlPackage.JDL_ENTITY_INCLUSION__PREDICATE:
        return predicate != null;
      case JdlPackage.JDL_ENTITY_INCLUSION__ENTITIES:
        return entities != null && !entities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JdlEntityInclusionImpl
