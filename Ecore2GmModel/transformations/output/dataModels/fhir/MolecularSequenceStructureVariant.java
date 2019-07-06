/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MolecularSequenceStructureVariant of the Data Model fhir.
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
{@link variantType}, 
{@link outer}, 
{@link inner}, 

* It provides of then following operations (getters and setters)
{@link getVariantType},
{@link getOuter},
{@link getInner},
{@link setVariantType},
{@link setOuter},
{@link setInner},
 */

@Description("Raw data describing a biological sequence.")

public interface MolecularSequenceStructureVariant extends GenericEntity, fhir.BackboneElement {

	EntityType<MolecularSequenceStructureVariant> T = EntityTypes.T(MolecularSequenceStructureVariant.class);

	/* Constants for each property name. */
	java.lang.String variantType = "variantType";
	java.lang.String outer = "outer";
	java.lang.String inner = "inner";

	@Description("Information about chromosome structure variation DNA change type.")
	@Mandatory
	fhir.CodeableConcept getVariantType();
	void setVariantType(fhir.CodeableConcept variantType);
	@Description("Structural variant outer.")
	@Mandatory
	fhir.MolecularSequenceOuter getOuter();
	void setOuter(fhir.MolecularSequenceOuter outer);
	@Description("Structural variant inner.")
	@Mandatory
	fhir.MolecularSequenceInner getInner();
	void setInner(fhir.MolecularSequenceInner inner);
}
