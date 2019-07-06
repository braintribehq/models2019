/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractSigner of the Data Model fhir.
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
{@link party}, 
{@link signature}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getParty},
{@link getSignature},
{@link setType},
{@link setParty},
{@link setSignature},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractSigner extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractSigner> T = EntityTypes.T(ContractSigner.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String party = "party";
	java.lang.String signature = "signature";

	@Description("Role of this Contract signer, e.g. notary, grantee.")
	@Mandatory
	fhir.Coding getType();
	void setType(fhir.Coding type);
	@Description("Party which is a signator to this Contract.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getParty();
	void setParty(com.braintribe.model.generic.GenericEntity party);
	@Description("Legally binding Contract DSIG signature contents in Base64.")
	
	java.util.List<fhir.Signature> getSignature();
	void setSignature(java.util.List<fhir.Signature> signature);

}
