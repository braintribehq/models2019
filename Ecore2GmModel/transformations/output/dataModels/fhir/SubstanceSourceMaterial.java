/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSourceMaterial of the Data Model fhir.
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
{@link sourceMaterialClass}, 
{@link sourceMaterialType}, 
{@link sourceMaterialState}, 
{@link organismId}, 
{@link parentSubstanceId}, 
{@link countryOfOrigin}, 
{@link developmentStage}, 
{@link fractionDescription}, 
{@link organism}, 
{@link partDescription}, 

* It provides of then following operations (getters and setters)
{@link getSourceMaterialClass},
{@link getSourceMaterialType},
{@link getSourceMaterialState},
{@link getOrganismId},
{@link getParentSubstanceId},
{@link getCountryOfOrigin},
{@link getDevelopmentStage},
{@link getFractionDescription},
{@link getOrganism},
{@link getPartDescription},
{@link setSourceMaterialClass},
{@link setSourceMaterialType},
{@link setSourceMaterialState},
{@link setOrganismId},
{@link setParentSubstanceId},
{@link setCountryOfOrigin},
{@link setDevelopmentStage},
{@link setFractionDescription},
{@link setOrganism},
{@link setPartDescription},
 */

@Description("Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.If the element is present, it must have either a @value, an @id, or extensions")

public interface SubstanceSourceMaterial extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SubstanceSourceMaterial> T = EntityTypes.T(SubstanceSourceMaterial.class);

	/* Constants for each property name. */
	java.lang.String sourceMaterialClass = "sourceMaterialClass";
	java.lang.String sourceMaterialType = "sourceMaterialType";
	java.lang.String sourceMaterialState = "sourceMaterialState";
	java.lang.String organismId = "organismId";
	java.lang.String parentSubstanceId = "parentSubstanceId";
	java.lang.String countryOfOrigin = "countryOfOrigin";
	java.lang.String developmentStage = "developmentStage";
	java.lang.String fractionDescription = "fractionDescription";
	java.lang.String organism = "organism";
	java.lang.String partDescription = "partDescription";

	@Description("General high level classification of the source material specific to the origin of the material.")
	@Mandatory
	fhir.CodeableConcept getSourceMaterialClass();
	void setSourceMaterialClass(fhir.CodeableConcept sourceMaterialClass);
	@Description("The type of the source material shall be specified based on a controlled vocabulary. For vaccines, this subclause refers to the class of infectious agent.")
	@Mandatory
	fhir.CodeableConcept getSourceMaterialType();
	void setSourceMaterialType(fhir.CodeableConcept sourceMaterialType);
	@Description("The state of the source material when extracted.")
	@Mandatory
	fhir.CodeableConcept getSourceMaterialState();
	void setSourceMaterialState(fhir.CodeableConcept sourceMaterialState);
	@Description("The unique identifier associated with the source material parent organism shall be specified.")
	@Mandatory
	fhir.Identifier getOrganismId();
	void setOrganismId(fhir.Identifier organismId);
	@Description("The parent of the herbal drug Ginkgo biloba, Leaf is the substance ID of the substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).")
	
	java.util.List<fhir.Identifier> getParentSubstanceId();
	void setParentSubstanceId(java.util.List<fhir.Identifier> parentSubstanceId);

	@Description("The country where the plant material is harvested or the countries where the plasma is sourced from as laid down in accordance with the Plasma Master File. For ?Plasma-derived substances? the attribute country of origin provides information about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.")
	
	java.util.List<fhir.CodeableConcept> getCountryOfOrigin();
	void setCountryOfOrigin(java.util.List<fhir.CodeableConcept> countryOfOrigin);

	@Description("Stage of life for animals, plants, insects and microorganisms. This information shall be provided only when the substance is significantly different in these stages (e.g. foetal bovine serum).")
	@Mandatory
	fhir.CodeableConcept getDevelopmentStage();
	void setDevelopmentStage(fhir.CodeableConcept developmentStage);
	@Description("Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are often necessary to define both Substances and Specified Group 1 Substances. For substances derived from Plants, fraction information will be captured at the Substance information level ( . Oils, Juices and Exudates). Additional information for Extracts, such as extraction solvent composition, will be captured at the Specified Substance Group 1 information level. For plasma-derived products fraction information will be captured at the Substance and the Specified Substance Group 1 levels.")
	
	java.util.List<fhir.SubstanceSourceMaterialFractionDescription> getFractionDescription();
	void setFractionDescription(java.util.List<fhir.SubstanceSourceMaterialFractionDescription> fractionDescription);

	@Description("This subclause describes the organism which the substance is derived from. For vaccines, the parent organism shall be specified based on these subclause elements. As an example, full taxonomy will be described for the Substance Name: ., Leaf.")
	@Mandatory
	fhir.SubstanceSourceMaterialOrganism getOrganism();
	void setOrganism(fhir.SubstanceSourceMaterialOrganism organism);
	@Description("To do.")
	
	java.util.List<fhir.SubstanceSourceMaterialPartDescription> getPartDescription();
	void setPartDescription(java.util.List<fhir.SubstanceSourceMaterialPartDescription> partDescription);

}
