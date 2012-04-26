/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc2x3tc1.IfcClassification;
import org.bimserver.models.ifc2x3tc1.IfcClassificationItem;
import org.bimserver.models.ifc2x3tc1.IfcClassificationItemRelationship;
import org.bimserver.models.ifc2x3tc1.IfcClassificationNotationFacet;
import org.bimserver.models.ifc2x3tc1.LogPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcClassificationItemImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcClassificationItemImpl#getItemOf <em>Item Of</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcClassificationItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcClassificationItemImpl#getIsClassifiedItemIn <em>Is Classified Item In</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcClassificationItemImpl#getIsClassifyingItemIn <em>Is Classifying Item In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationItemImpl extends IdEObjectImpl implements IfcClassificationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.IFC_CLASSIFICATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationFacet getNotation() {
		return (IfcClassificationNotationFacet) eGet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__NOTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(IfcClassificationNotationFacet newNotation) {
		eSet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__NOTATION, newNotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassification getItemOf() {
		return (IfcClassification) eGet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__ITEM_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemOf(IfcClassification newItemOf) {
		eSet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__ITEM_OF, newItemOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemOf() {
		eUnset(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__ITEM_OF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemOf() {
		return eIsSet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__ITEM_OF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String) eGet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcClassificationItemRelationship> getIsClassifiedItemIn() {
		return (EList<IfcClassificationItemRelationship>) eGet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsClassifiedItemIn() {
		eUnset(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsClassifiedItemIn() {
		return eIsSet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcClassificationItemRelationship> getIsClassifyingItemIn() {
		return (EList<IfcClassificationItemRelationship>) eGet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsClassifyingItemIn() {
		eUnset(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsClassifyingItemIn() {
		return eIsSet(LogPackage.Literals.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN);
	}

} //IfcClassificationItemImpl