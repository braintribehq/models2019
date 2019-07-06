/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSourceMaterialOrganism of the Data Model fhir.
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
{@link family}, 
{@link genus}, 
{@link species}, 
{@link intraspecificType}, 
{@link author}, 
{@link hybrid}, 
{@link organismGeneral}, 

* It provides of then following operations (getters and setters)
{@link getFamily},
{@link getGenus},
{@link getSpecies},
{@link getIntraspecificType},
{@link getAuthor},
{@link getHybrid},
{@link getOrganismGeneral},
{@link setFamily},
{@link setGenus},
{@link setSpecies},
{@link setIntraspecificType},
{@link setAuthor},
{@link setHybrid},
{@link setOrganismGeneral},
 */

@Description("Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.")

public interface SubstanceSourceMaterialOrganism extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSourceMaterialOrganism> T = EntityTypes.T(SubstanceSourceMaterialOrganism.class);

	/* Constants for each property name. */
	java.lang.String family = "family";
	java.lang.String genus = "genus";
	java.lang.String species = "species";
	java.lang.String intraspecificType = "intraspecificType";
	java.lang.String author = "author";
	java.lang.String hybrid = "hybrid";
	java.lang.String organismGeneral = "organismGeneral";

	@Description("The family of an organism shall be specified.")
	@Mandatory
	fhir.CodeableConcept getFamily();
	void setFamily(fhir.CodeableConcept family);
	@Description("The genus of an organism shall be specified; refers to the Latin epithet of the genus element of the plant/animal scientific name; it is present in names for genera, species and infraspecies.")
	@Mandatory
	fhir.CodeableConcept getGenus();
	void setGenus(fhir.CodeableConcept genus);
	@Description("The species of an organism shall be specified; refers to the Latin epithet of the species of the plant/animal; it is present in names for species and infraspecies.")
	@Mandatory
	fhir.CodeableConcept getSpecies();
	void setSpecies(fhir.CodeableConcept species);
	@Description("The Intraspecific type of an organism shall be specified.")
	@Mandatory
	fhir.CodeableConcept getIntraspecificType();
	void setIntraspecificType(fhir.CodeableConcept intraspecificType);
	@Description("4.9.13.6.1 Author type (Conditional).")
	
	java.util.List<fhir.SubstanceSourceMaterialAuthor> getAuthor();
	void setAuthor(java.util.List<fhir.SubstanceSourceMaterialAuthor> author);

	@Description("4.9.13.8.1 Hybrid species maternal organism ID (Optional).")
	@Mandatory
	fhir.SubstanceSourceMaterialHybrid getHybrid();
	void setHybrid(fhir.SubstanceSourceMaterialHybrid hybrid);
	@Description("4.9.13.7.1 Kingdom (Conditional).")
	@Mandatory
	fhir.SubstanceSourceMaterialOrganismGeneral getOrganismGeneral();
	void setOrganismGeneral(fhir.SubstanceSourceMaterialOrganismGeneral organismGeneral);
}
