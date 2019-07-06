/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MolecularSequence of the Data Model fhir.
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
{@link patient}, 
{@link specimen}, 
{@link device}, 
{@link performer}, 
{@link quantity}, 
{@link referenceSeq}, 
{@link variant}, 
{@link quality}, 
{@link repository}, 
{@link pointer}, 
{@link structureVariant}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPatient},
{@link getSpecimen},
{@link getDevice},
{@link getPerformer},
{@link getQuantity},
{@link getReferenceSeq},
{@link getVariant},
{@link getQuality},
{@link getRepository},
{@link getPointer},
{@link getStructureVariant},
{@link setIdentifier},
{@link setPatient},
{@link setSpecimen},
{@link setDevice},
{@link setPerformer},
{@link setQuantity},
{@link setReferenceSeq},
{@link setVariant},
{@link setQuality},
{@link setRepository},
{@link setPointer},
{@link setStructureVariant},
 */

@Description("Raw data describing a biological sequence.If the element is present, it must have either a @value, an @id, or extensions")

public interface MolecularSequence extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MolecularSequence> T = EntityTypes.T(MolecularSequence.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String patient = "patient";
	java.lang.String specimen = "specimen";
	java.lang.String device = "device";
	java.lang.String performer = "performer";
	java.lang.String quantity = "quantity";
	java.lang.String referenceSeq = "referenceSeq";
	java.lang.String variant = "variant";
	java.lang.String quality = "quality";
	java.lang.String repository = "repository";
	java.lang.String pointer = "pointer";
	java.lang.String structureVariant = "structureVariant";

	@Description("A unique identifier for this particular sequence instance. This is a FHIR-defined id.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The patient whose sequencing results are described by this resource.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("Specimen used for sequencing.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSpecimen();
	void setSpecimen(com.braintribe.model.generic.GenericEntity specimen);
	@Description("The method for sequencing, for example, chip information.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDevice();
	void setDevice(com.braintribe.model.generic.GenericEntity device);
	@Description("The organization or lab that should be responsible for this result.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPerformer();
	void setPerformer(com.braintribe.model.generic.GenericEntity performer);
	@Description("The number of copies of the sequence of interest. (RNASeq).")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("A sequence that is used as a reference to describe variants that are present in a sequence analyzed.")
	@Mandatory
	fhir.MolecularSequenceReferenceSeq getReferenceSeq();
	void setReferenceSeq(fhir.MolecularSequenceReferenceSeq referenceSeq);
	@Description("The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.")
	
	java.util.List<fhir.MolecularSequenceVariant> getVariant();
	void setVariant(java.util.List<fhir.MolecularSequenceVariant> variant);

	@Description("An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).")
	
	java.util.List<fhir.MolecularSequenceQuality> getQuality();
	void setQuality(java.util.List<fhir.MolecularSequenceQuality> quality);

	@Description("Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.")
	
	java.util.List<fhir.MolecularSequenceRepository> getRepository();
	void setRepository(java.util.List<fhir.MolecularSequenceRepository> repository);

	@Description("Pointer to next atomic sequence which at most contains one variant.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPointer();
	void setPointer(java.util.List<com.braintribe.model.generic.GenericEntity> pointer);

	@Description("Information about chromosome structure variation.")
	
	java.util.List<fhir.MolecularSequenceStructureVariant> getStructureVariant();
	void setStructureVariant(java.util.List<fhir.MolecularSequenceStructureVariant> structureVariant);

}
