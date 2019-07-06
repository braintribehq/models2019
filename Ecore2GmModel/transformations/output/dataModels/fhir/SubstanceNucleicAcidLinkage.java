/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceNucleicAcidLinkage of the Data Model fhir.
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
{@link identifier}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link setIdentifier},
 */

@Description("Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5?-3? direction.")

public interface SubstanceNucleicAcidLinkage extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceNucleicAcidLinkage> T = EntityTypes.T(SubstanceNucleicAcidLinkage.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";

	@Description("Each linkage will be registered as a fragment and have an ID.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
}
