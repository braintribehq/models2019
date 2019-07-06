/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstancePolymerMonomerSet of the Data Model fhir.
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
{@link ratioType}, 
{@link startingMaterial}, 

* It provides of then following operations (getters and setters)
{@link getRatioType},
{@link getStartingMaterial},
{@link setRatioType},
{@link setStartingMaterial},
 */

@Description("Todo.")

public interface SubstancePolymerMonomerSet extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstancePolymerMonomerSet> T = EntityTypes.T(SubstancePolymerMonomerSet.class);

	/* Constants for each property name. */
	java.lang.String ratioType = "ratioType";
	java.lang.String startingMaterial = "startingMaterial";

	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getRatioType();
	void setRatioType(fhir.CodeableConcept ratioType);
	@Description("Todo.")
	
	java.util.List<fhir.SubstancePolymerStartingMaterial> getStartingMaterial();
	void setStartingMaterial(java.util.List<fhir.SubstancePolymerStartingMaterial> startingMaterial);

}
