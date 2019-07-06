/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecificationName of the Data Model fhir.
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
{@link status}, 
{@link language}, 
{@link domain}, 
{@link jurisdiction}, 
{@link synonym}, 
{@link translation}, 
{@link official}, 
{@link source}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getStatus},
{@link getLanguage},
{@link getDomain},
{@link getJurisdiction},
{@link getSynonym},
{@link getTranslation},
{@link getOfficial},
{@link getSource},
{@link setType},
{@link setStatus},
{@link setLanguage},
{@link setDomain},
{@link setJurisdiction},
{@link setSynonym},
{@link setTranslation},
{@link setOfficial},
{@link setSource},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")

public interface SubstanceSpecificationName extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSpecificationName> T = EntityTypes.T(SubstanceSpecificationName.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String status = "status";
	java.lang.String language = "language";
	java.lang.String domain = "domain";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String synonym = "synonym";
	java.lang.String translation = "translation";
	java.lang.String official = "official";
	java.lang.String source = "source";

	@Description("Name type.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The status of the name.")
	@Mandatory
	fhir.CodeableConcept getStatus();
	void setStatus(fhir.CodeableConcept status);
	@Description("Language of the name.")
	
	java.util.List<fhir.CodeableConcept> getLanguage();
	void setLanguage(java.util.List<fhir.CodeableConcept> language);

	@Description("The use context of this name for example if there is a different name a drug active ingredient as opposed to a food colour additive.")
	
	java.util.List<fhir.CodeableConcept> getDomain();
	void setDomain(java.util.List<fhir.CodeableConcept> domain);

	@Description("The jurisdiction where this name applies.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("A synonym of this name.")
	
	java.util.List<fhir.SubstanceSpecificationName> getSynonym();
	void setSynonym(java.util.List<fhir.SubstanceSpecificationName> synonym);

	@Description("A translation for this name.")
	
	java.util.List<fhir.SubstanceSpecificationName> getTranslation();
	void setTranslation(java.util.List<fhir.SubstanceSpecificationName> translation);

	@Description("Details of the official nature of this name.")
	
	java.util.List<fhir.SubstanceSpecificationOfficial> getOfficial();
	void setOfficial(java.util.List<fhir.SubstanceSpecificationOfficial> official);

	@Description("Supporting literature.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSource();
	void setSource(java.util.List<com.braintribe.model.generic.GenericEntity> source);

}
