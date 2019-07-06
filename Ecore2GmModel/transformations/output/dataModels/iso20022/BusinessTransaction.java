/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BusinessTransaction of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link businessProcessTrace}, 
{@link participant}, 
{@link transmission}, 
{@link messageTransportMode}, 
{@link subTransaction}, 
{@link parentTransaction}, 
{@link trace}, 

* It provides of then following operations (getters and setters)
{@link getBusinessProcessTrace},
{@link getParticipant},
{@link getTransmission},
{@link getMessageTransportMode},
{@link getSubTransaction},
{@link getParentTransaction},
{@link getTrace},
{@link setBusinessProcessTrace},
{@link setParticipant},
{@link setTransmission},
{@link setMessageTransportMode},
{@link setSubTransaction},
{@link setParentTransaction},
{@link setTrace},
 */

@Description("particular solution that meets the communication requirements and the interaction requirements of a particular BusinessProcess and BusinessArea")

public interface BusinessTransaction extends GenericEntity, iso20022.TopLevelCatalogueEntry {

	EntityType<BusinessTransaction> T = EntityTypes.T(BusinessTransaction.class);

	/* Constants for each property name. */
	java.lang.String businessProcessTrace = "businessProcessTrace";
	java.lang.String participant = "participant";
	java.lang.String transmission = "transmission";
	java.lang.String messageTransportMode = "messageTransportMode";
	java.lang.String subTransaction = "subTransaction";
	java.lang.String parentTransaction = "parentTransaction";
	java.lang.String trace = "trace";

	@Description("the BusinessProcessTrace that is used to trace the BusinessTransaction")
	@Mandatory
	iso20022.BusinessProcess getBusinessProcessTrace();
	void setBusinessProcessTrace(iso20022.BusinessProcess businessProcessTrace);
	@Description("the involvement of a BusinessRole in a BusinessTransaction")
	
	java.util.List<iso20022.Participant> getParticipant();
	void setParticipant(java.util.List<iso20022.Participant> participant);

	@Description("he conveyance of information from a sending Participant in the context of a BusinessTransaction")
	
	java.util.List<iso20022.MessageTransmission> getTransmission();
	void setTransmission(java.util.List<iso20022.MessageTransmission> transmission);

	@Description("Provides a set of characterstics for a MessageTransportMode to have in the context of a single BusinessTransaction")
	@Mandatory
	iso20022.MessageTransportMode getMessageTransportMode();
	void setMessageTransportMode(iso20022.MessageTransportMode messageTransportMode);
	@Description("decomposition of a BusinessTransaction into a number of sub transactions which are BusinessTransactions in their own right.")
	
	java.util.List<iso20022.BusinessTransaction> getSubTransaction();
	void setSubTransaction(java.util.List<iso20022.BusinessTransaction> subTransaction);

	@Description("assembly of a number of BusinessTransactions that together form a BusinessTransaction")
	@Mandatory
	iso20022.BusinessTransaction getParentTransaction();
	void setParentTransaction(iso20022.BusinessTransaction parentTransaction);
	@Description("all of the BusinessTransactionTraces that derive MessageChoreographies from one BusinessTransaction")
	
	java.util.List<iso20022.MessageChoreography> getTrace();
	void setTrace(java.util.List<iso20022.MessageChoreography> trace);

}
