/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CoverageCostToBeneficiary of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link type}, 
{@link valueQuantity}, 
{@link valueMoney}, 
{@link exception}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getValueQuantity},
{@link getValueMoney},
{@link getException},
{@link setType},
{@link setValueQuantity},
{@link setValueMoney},
{@link setException},
 */

@Description("Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.")

public interface CoverageCostToBeneficiary extends GenericEntity, fhir.BackboneElement {

	EntityType<CoverageCostToBeneficiary> T = EntityTypes.T(CoverageCostToBeneficiary.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueMoney = "valueMoney";
	java.lang.String exception = "exception";

	@Description("The category of patient centric costs associated with treatment.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("")
	@Mandatory
	fhir.Quantity getValueQuantity();
	void setValueQuantity(fhir.Quantity valueQuantity);
	@Description("")
	@Mandatory
	fhir.Money getValueMoney();
	void setValueMoney(fhir.Money valueMoney);
	@Description("A suite of codes indicating exceptions or reductions to patient costs and their effective periods.")
	
	java.util.List<fhir.CoverageException> getException();
	void setException(java.util.List<fhir.CoverageException> exception);

}
