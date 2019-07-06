/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceReferenceInformationTarget of the Data Model fhir.
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
{@link target}, 
{@link type}, 
{@link interaction}, 
{@link organism}, 
{@link organismType}, 
{@link amountQuantity}, 
{@link amountRange}, 
{@link amountType}, 
{@link source}, 

* It provides of then following operations (getters and setters)
{@link getTarget},
{@link getType},
{@link getInteraction},
{@link getOrganism},
{@link getOrganismType},
{@link getAmountQuantity},
{@link getAmountRange},
{@link getAmountType},
{@link getSource},
{@link setTarget},
{@link setType},
{@link setInteraction},
{@link setOrganism},
{@link setOrganismType},
{@link setAmountQuantity},
{@link setAmountRange},
{@link setAmountType},
{@link setSource},
 */

@Description("Todo.")

public interface SubstanceReferenceInformationTarget extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceReferenceInformationTarget> T = EntityTypes.T(SubstanceReferenceInformationTarget.class);

	/* Constants for each property name. */
	java.lang.String target = "target";
	java.lang.String type = "type";
	java.lang.String interaction = "interaction";
	java.lang.String organism = "organism";
	java.lang.String organismType = "organismType";
	java.lang.String amountQuantity = "amountQuantity";
	java.lang.String amountRange = "amountRange";
	java.lang.String amountType = "amountType";
	java.lang.String source = "source";

	@Description("Todo.")
	@Mandatory
	fhir.Identifier getTarget();
	void setTarget(fhir.Identifier target);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getInteraction();
	void setInteraction(fhir.CodeableConcept interaction);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getOrganism();
	void setOrganism(fhir.CodeableConcept organism);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getOrganismType();
	void setOrganismType(fhir.CodeableConcept organismType);
	@Description("")
	@Mandatory
	fhir.Quantity getAmountQuantity();
	void setAmountQuantity(fhir.Quantity amountQuantity);
	@Description("")
	@Mandatory
	fhir.Range getAmountRange();
	void setAmountRange(fhir.Range amountRange);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getAmountType();
	void setAmountType(fhir.CodeableConcept amountType);
	@Description("Todo.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSource();
	void setSource(java.util.List<com.braintribe.model.generic.GenericEntity> source);

}
