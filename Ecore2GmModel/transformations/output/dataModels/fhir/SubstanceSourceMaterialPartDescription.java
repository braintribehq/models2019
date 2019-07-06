/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSourceMaterialPartDescription of the Data Model fhir.
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
{@link part}, 
{@link partLocation}, 

* It provides of then following operations (getters and setters)
{@link getPart},
{@link getPartLocation},
{@link setPart},
{@link setPartLocation},
 */

@Description("Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.")

public interface SubstanceSourceMaterialPartDescription extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSourceMaterialPartDescription> T = EntityTypes.T(SubstanceSourceMaterialPartDescription.class);

	/* Constants for each property name. */
	java.lang.String part = "part";
	java.lang.String partLocation = "partLocation";

	@Description("Entity of anatomical origin of source material within an organism.")
	@Mandatory
	fhir.CodeableConcept getPart();
	void setPart(fhir.CodeableConcept part);
	@Description("The detailed anatomic location when the part can be extracted from different anatomical locations of the organism. Multiple alternative locations may apply.")
	@Mandatory
	fhir.CodeableConcept getPartLocation();
	void setPartLocation(fhir.CodeableConcept partLocation);
}
