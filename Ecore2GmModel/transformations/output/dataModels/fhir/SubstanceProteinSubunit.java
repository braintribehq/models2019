/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceProteinSubunit of the Data Model fhir.
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
{@link nTerminalModificationId}, 
{@link cTerminalModificationId}, 

* It provides of then following operations (getters and setters)
{@link getSequenceAttachment},
{@link getNTerminalModificationId},
{@link getCTerminalModificationId},
{@link setSequenceAttachment},
{@link setNTerminalModificationId},
{@link setCTerminalModificationId},
 */

@Description("A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.")

public interface SubstanceProteinSubunit extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceProteinSubunit> T = EntityTypes.T(SubstanceProteinSubunit.class);

	/* Constants for each property name. */
	java.lang.String sequenceAttachment = "sequenceAttachment";
	java.lang.String nTerminalModificationId = "nTerminalModificationId";
	java.lang.String cTerminalModificationId = "cTerminalModificationId";

	@Description("The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids that are not represented with a single letter code an X should be used within the sequence. The modified amino acids will be distinguished by their position in the sequence.")
	@Mandatory
	fhir.Attachment getSequenceAttachment();
	void setSequenceAttachment(fhir.Attachment sequenceAttachment);
	@Description("Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.")
	@Mandatory
	fhir.Identifier getNTerminalModificationId();
	void setNTerminalModificationId(fhir.Identifier nTerminalModificationId);
	@Description("Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.")
	@Mandatory
	fhir.Identifier getCTerminalModificationId();
	void setCTerminalModificationId(fhir.Identifier cTerminalModificationId);
}
