/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MolecularSequenceReferenceSeq of the Data Model fhir.
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
{@link chromosome}, 
{@link referenceSeqId}, 
{@link referenceSeqPointer}, 

* It provides of then following operations (getters and setters)
{@link getChromosome},
{@link getReferenceSeqId},
{@link getReferenceSeqPointer},
{@link setChromosome},
{@link setReferenceSeqId},
{@link setReferenceSeqPointer},
 */

@Description("Raw data describing a biological sequence.")

public interface MolecularSequenceReferenceSeq extends GenericEntity, fhir.BackboneElement {

	EntityType<MolecularSequenceReferenceSeq> T = EntityTypes.T(MolecularSequenceReferenceSeq.class);

	/* Constants for each property name. */
	java.lang.String chromosome = "chromosome";
	java.lang.String referenceSeqId = "referenceSeqId";
	java.lang.String referenceSeqPointer = "referenceSeqPointer";

	@Description("Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).")
	@Mandatory
	fhir.CodeableConcept getChromosome();
	void setChromosome(fhir.CodeableConcept chromosome);
	@Description("Reference identifier of reference sequence submitted to NCBI. It must match the type in the MolecularSequence.type field. For example, the prefix, ?NG_? identifies reference sequence for genes, ?NM_? for messenger RNA transcripts, and ?NP_? for amino acid sequences.")
	@Mandatory
	fhir.CodeableConcept getReferenceSeqId();
	void setReferenceSeqId(fhir.CodeableConcept referenceSeqId);
	@Description("A pointer to another MolecularSequence entity as reference sequence.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReferenceSeqPointer();
	void setReferenceSeqPointer(com.braintribe.model.generic.GenericEntity referenceSeqPointer);
}
