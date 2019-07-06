/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecificationRelationship of the Data Model fhir.
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
{@link substanceReference}, 
{@link substanceCodeableConcept}, 
{@link relationship}, 
{@link amountQuantity}, 
{@link amountRange}, 
{@link amountRatio}, 
{@link amountRatioLowLimit}, 
{@link amountType}, 
{@link source}, 

* It provides of then following operations (getters and setters)
{@link getSubstanceReference},
{@link getSubstanceCodeableConcept},
{@link getRelationship},
{@link getAmountQuantity},
{@link getAmountRange},
{@link getAmountRatio},
{@link getAmountRatioLowLimit},
{@link getAmountType},
{@link getSource},
{@link setSubstanceReference},
{@link setSubstanceCodeableConcept},
{@link setRelationship},
{@link setAmountQuantity},
{@link setAmountRange},
{@link setAmountRatio},
{@link setAmountRatioLowLimit},
{@link setAmountType},
{@link setSource},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")

public interface SubstanceSpecificationRelationship extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSpecificationRelationship> T = EntityTypes.T(SubstanceSpecificationRelationship.class);

	/* Constants for each property name. */
	java.lang.String substanceReference = "substanceReference";
	java.lang.String substanceCodeableConcept = "substanceCodeableConcept";
	java.lang.String relationship = "relationship";
	java.lang.String amountQuantity = "amountQuantity";
	java.lang.String amountRange = "amountRange";
	java.lang.String amountRatio = "amountRatio";
	java.lang.String amountRatioLowLimit = "amountRatioLowLimit";
	java.lang.String amountType = "amountType";
	java.lang.String source = "source";

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubstanceReference();
	void setSubstanceReference(com.braintribe.model.generic.GenericEntity substanceReference);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getSubstanceCodeableConcept();
	void setSubstanceCodeableConcept(fhir.CodeableConcept substanceCodeableConcept);
	@Description("For example 'salt to parent', 'active moiety', 'starting material'.")
	@Mandatory
	fhir.CodeableConcept getRelationship();
	void setRelationship(fhir.CodeableConcept relationship);
	@Description("")
	@Mandatory
	fhir.Quantity getAmountQuantity();
	void setAmountQuantity(fhir.Quantity amountQuantity);
	@Description("")
	@Mandatory
	fhir.Range getAmountRange();
	void setAmountRange(fhir.Range amountRange);
	@Description("")
	@Mandatory
	fhir.Ratio getAmountRatio();
	void setAmountRatio(fhir.Ratio amountRatio);
	@Description("For use when the numeric.")
	@Mandatory
	fhir.Ratio getAmountRatioLowLimit();
	void setAmountRatioLowLimit(fhir.Ratio amountRatioLowLimit);
	@Description("An operator for the amount, for example 'average', 'approximately', 'less than'.")
	@Mandatory
	fhir.CodeableConcept getAmountType();
	void setAmountType(fhir.CodeableConcept amountType);
	@Description("Supporting literature.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSource();
	void setSource(java.util.List<com.braintribe.model.generic.GenericEntity> source);

}
