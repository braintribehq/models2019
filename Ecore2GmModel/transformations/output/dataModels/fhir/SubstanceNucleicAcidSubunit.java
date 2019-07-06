/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceNucleicAcidSubunit of the Data Model fhir.
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
{@link sequenceAttachment}, 
{@link fivePrime}, 
{@link threePrime}, 
{@link linkage}, 
{@link sugar}, 

* It provides of then following operations (getters and setters)
{@link getSequenceAttachment},
{@link getFivePrime},
{@link getThreePrime},
{@link getLinkage},
{@link getSugar},
{@link setSequenceAttachment},
{@link setFivePrime},
{@link setThreePrime},
{@link setLinkage},
{@link setSugar},
 */

@Description("Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5?-3? direction.")

public interface SubstanceNucleicAcidSubunit extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceNucleicAcidSubunit> T = EntityTypes.T(SubstanceNucleicAcidSubunit.class);

	/* Constants for each property name. */
	java.lang.String sequenceAttachment = "sequenceAttachment";
	java.lang.String fivePrime = "fivePrime";
	java.lang.String threePrime = "threePrime";
	java.lang.String linkage = "linkage";
	java.lang.String sugar = "sugar";

	@Description("(TBC).")
	@Mandatory
	fhir.Attachment getSequenceAttachment();
	void setSequenceAttachment(fhir.Attachment sequenceAttachment);
	@Description("The nucleotide present at the 5? terminal shall be specified based on a controlled vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5? prime nucleotide is the letter at the first position in the sequence. A separate representation would be redundant.")
	@Mandatory
	fhir.CodeableConcept getFivePrime();
	void setFivePrime(fhir.CodeableConcept fivePrime);
	@Description("The nucleotide present at the 3? terminal shall be specified based on a controlled vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5? prime nucleotide is the letter at the last position in the sequence. A separate representation would be redundant.")
	@Mandatory
	fhir.CodeableConcept getThreePrime();
	void setThreePrime(fhir.CodeableConcept threePrime);
	@Description("The linkages between sugar residues will also be captured.")
	
	java.util.List<fhir.SubstanceNucleicAcidLinkage> getLinkage();
	void setLinkage(java.util.List<fhir.SubstanceNucleicAcidLinkage> linkage);

	@Description("5.3.6.8.1 Sugar ID (Mandatory).")
	
	java.util.List<fhir.SubstanceNucleicAcidSugar> getSugar();
	void setSugar(java.util.List<fhir.SubstanceNucleicAcidSugar> sugar);

}
