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

import org.bimserver.models.ifc2x3tc1.IfcTransportElement;
import org.bimserver.models.ifc2x3tc1.IfcTransportElementTypeEnum;
import org.bimserver.models.ifc2x3tc1.LogPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Transport Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByWeight <em>Capacity By Weight</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByWeightAsString <em>Capacity By Weight As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByNumber <em>Capacity By Number</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByNumberAsString <em>Capacity By Number As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTransportElementImpl extends IfcElementImpl implements IfcTransportElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTransportElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.IFC_TRANSPORT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransportElementTypeEnum getOperationType() {
		return (IfcTransportElementTypeEnum) eGet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcTransportElementTypeEnum newOperationType) {
		eSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE, newOperationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationType() {
		eUnset(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationType() {
		return eIsSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapacityByWeight() {
		return (Double) eGet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByWeight(double newCapacityByWeight) {
		eSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT, newCapacityByWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByWeight() {
		eUnset(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByWeight() {
		return eIsSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityByWeightAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByWeightAsString(String newCapacityByWeightAsString) {
		eSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING, newCapacityByWeightAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByWeightAsString() {
		eUnset(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByWeightAsString() {
		return eIsSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapacityByNumber() {
		return (Double) eGet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByNumber(double newCapacityByNumber) {
		eSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER, newCapacityByNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByNumber() {
		eUnset(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByNumber() {
		return eIsSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityByNumberAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByNumberAsString(String newCapacityByNumberAsString) {
		eSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING, newCapacityByNumberAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByNumberAsString() {
		eUnset(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByNumberAsString() {
		return eIsSet(LogPackage.Literals.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING);
	}

} //IfcTransportElementImpl