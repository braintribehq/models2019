/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecification of the Data Model fhir.
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
{@link type}, 
{@link status}, 
{@link domain}, 
{@link source}, 
{@link moiety}, 
{@link property}, 
{@link referenceInformation}, 
{@link structure}, 
{@link code}, 
{@link name}, 
{@link molecularWeight}, 
{@link relationship}, 
{@link nucleicAcid}, 
{@link polymer}, 
{@link protein}, 
{@link sourceMaterial}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getStatus},
{@link getDomain},
{@link getSource},
{@link getMoiety},
{@link getProperty},
{@link getReferenceInformation},
{@link getStructure},
{@link getCode},
{@link getName},
{@link getMolecularWeight},
{@link getRelationship},
{@link getNucleicAcid},
{@link getPolymer},
{@link getProtein},
{@link getSourceMaterial},
{@link setIdentifier},
{@link setType},
{@link setStatus},
{@link setDomain},
{@link setSource},
{@link setMoiety},
{@link setProperty},
{@link setReferenceInformation},
{@link setStructure},
{@link setCode},
{@link setName},
{@link setMolecularWeight},
{@link setRelationship},
{@link setNucleicAcid},
{@link setPolymer},
{@link setProtein},
{@link setSourceMaterial},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.If the element is present, it must have either a @value, an @id, or extensions")

public interface SubstanceSpecification extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SubstanceSpecification> T = EntityTypes.T(SubstanceSpecification.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String status = "status";
	java.lang.String domain = "domain";
	java.lang.String source = "source";
	java.lang.String moiety = "moiety";
	java.lang.String property = "property";
	java.lang.String referenceInformation = "referenceInformation";
	java.lang.String structure = "structure";
	java.lang.String code = "code";
	java.lang.String name = "name";
	java.lang.String molecularWeight = "molecularWeight";
	java.lang.String relationship = "relationship";
	java.lang.String nucleicAcid = "nucleicAcid";
	java.lang.String polymer = "polymer";
	java.lang.String protein = "protein";
	java.lang.String sourceMaterial = "sourceMaterial";

	@Description("Identifier by which this substance is known.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("High level categorization, e.g. polymer or nucleic acid.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Status of substance within the catalogue e.g. approved.")
	@Mandatory
	fhir.CodeableConcept getStatus();
	void setStatus(fhir.CodeableConcept status);
	@Description("If the substance applies to only human or veterinary use.")
	@Mandatory
	fhir.CodeableConcept getDomain();
	void setDomain(fhir.CodeableConcept domain);
	@Description("Supporting literature.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSource();
	void setSource(java.util.List<com.braintribe.model.generic.GenericEntity> source);

	@Description("Moiety, for structural modifications.")
	
	java.util.List<fhir.SubstanceSpecificationMoiety> getMoiety();
	void setMoiety(java.util.List<fhir.SubstanceSpecificationMoiety> moiety);

	@Description("General specifications for this substance, including how it is related to other substances.")
	
	java.util.List<fhir.SubstanceSpecificationProperty> getProperty();
	void setProperty(java.util.List<fhir.SubstanceSpecificationProperty> property);

	@Description("General information detailing this substance.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReferenceInformation();
	void setReferenceInformation(com.braintribe.model.generic.GenericEntity referenceInformation);
	@Description("Structural information.")
	@Mandatory
	fhir.SubstanceSpecificationStructure getStructure();
	void setStructure(fhir.SubstanceSpecificationStructure structure);
	@Description("Codes associated with the substance.")
	
	java.util.List<fhir.SubstanceSpecificationCode> getCode();
	void setCode(java.util.List<fhir.SubstanceSpecificationCode> code);

	@Description("Names applicable to this substance.")
	
	java.util.List<fhir.SubstanceSpecificationName> getName();
	void setName(java.util.List<fhir.SubstanceSpecificationName> name);

	@Description("The molecular weight or weight range (for proteins, polymers or nucleic acids).")
	
	java.util.List<fhir.SubstanceSpecificationMolecularWeight> getMolecularWeight();
	void setMolecularWeight(java.util.List<fhir.SubstanceSpecificationMolecularWeight> molecularWeight);

	@Description("A link between this substance and another, with details of the relationship.")
	
	java.util.List<fhir.SubstanceSpecificationRelationship> getRelationship();
	void setRelationship(java.util.List<fhir.SubstanceSpecificationRelationship> relationship);

	@Description("Data items specific to nucleic acids.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getNucleicAcid();
	void setNucleicAcid(com.braintribe.model.generic.GenericEntity nucleicAcid);
	@Description("Data items specific to polymers.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPolymer();
	void setPolymer(com.braintribe.model.generic.GenericEntity polymer);
	@Description("Data items specific to proteins.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProtein();
	void setProtein(com.braintribe.model.generic.GenericEntity protein);
	@Description("Material or taxonomic/anatomical source for the substance.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSourceMaterial();
	void setSourceMaterial(com.braintribe.model.generic.GenericEntity sourceMaterial);
}
