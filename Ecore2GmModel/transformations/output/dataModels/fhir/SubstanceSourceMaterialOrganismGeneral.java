/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSourceMaterialOrganismGeneral of the Data Model fhir.
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
{@link kingdom}, 
{@link phylum}, 
{@link class_}, 
{@link order}, 

* It provides of then following operations (getters and setters)
{@link getKingdom},
{@link getPhylum},
{@link getClass_},
{@link getOrder},
{@link setKingdom},
{@link setPhylum},
{@link setClass_},
{@link setOrder},
 */

@Description("Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.")

public interface SubstanceSourceMaterialOrganismGeneral extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSourceMaterialOrganismGeneral> T = EntityTypes.T(SubstanceSourceMaterialOrganismGeneral.class);

	/* Constants for each property name. */
	java.lang.String kingdom = "kingdom";
	java.lang.String phylum = "phylum";
	java.lang.String class_ = "class_";
	java.lang.String order = "order";

	@Description("The kingdom of an organism shall be specified.")
	@Mandatory
	fhir.CodeableConcept getKingdom();
	void setKingdom(fhir.CodeableConcept kingdom);
	@Description("The phylum of an organism shall be specified.")
	@Mandatory
	fhir.CodeableConcept getPhylum();
	void setPhylum(fhir.CodeableConcept phylum);
	@Description("The class of an organism shall be specified.")
	@Mandatory
	fhir.CodeableConcept getClass_();
	void setClass_(fhir.CodeableConcept class_);
	@Description("The order of an organism shall be specified,.")
	@Mandatory
	fhir.CodeableConcept getOrder();
	void setOrder(fhir.CodeableConcept order);
}
