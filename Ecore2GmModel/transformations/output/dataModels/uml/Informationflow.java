/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Informationflow of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link conveyed}, 
{@link informationSource}, 
{@link informationTarget}, 
{@link realization}, 
{@link realizingActivityEdge}, 
{@link realizingConnector}, 
{@link realizingMessage}, 

* It provides of then following operations (getters and setters)
{@link getConveyed},
{@link getInformationSource},
{@link getInformationTarget},
{@link getRealization},
{@link getRealizingActivityEdge},
{@link getRealizingConnector},
{@link getRealizingMessage},
{@link setConveyed},
{@link setInformationSource},
{@link setInformationTarget},
{@link setRealization},
{@link setRealizingActivityEdge},
{@link setRealizingConnector},
{@link setRealizingMessage},
 */

@Description("InformationFlows describe circulation of information through a system in a general manner. They do not specify the nature of the information, mechanisms by which it is conveyed, sequences of exchange or any control conditions. During more detailed modeling, representation and realization links may be added to specify which model elements implement an InformationFlow and to show how information is conveyed.  InformationFlows require some kind of ?information channel? for unidirectional transmission of information items from sources to targets.? They specify the information channel?s realizations, if any, and identify the information that flows along them.? Information moving along the information channel may be represented by abstract InformationItems and by concrete Classifiers.<p>From package UML::InformationFlows.</p>")

public interface Informationflow extends GenericEntity, uml.Packageableelement, uml.Directedrelationship {

	EntityType<Informationflow> T = EntityTypes.T(Informationflow.class);

	/* Constants for each property name. */
	java.lang.String conveyed = "conveyed";
	java.lang.String informationSource = "informationSource";
	java.lang.String informationTarget = "informationTarget";
	java.lang.String realization = "realization";
	java.lang.String realizingActivityEdge = "realizingActivityEdge";
	java.lang.String realizingConnector = "realizingConnector";
	java.lang.String realizingMessage = "realizingMessage";

	@Description("Specifies the information items that may circulate on this information flow.<p>From package UML::InformationFlows.</p>")
	
	java.util.List<uml.Classifier> getConveyed();
	void setConveyed(java.util.List<uml.Classifier> conveyed);

	@Description("Defines from which source the conveyed InformationItems are initiated.<p>From package UML::InformationFlows.</p>")
	
	java.util.List<uml.Namedelement> getInformationSource();
	void setInformationSource(java.util.List<uml.Namedelement> informationSource);

	@Description("Defines to which target the conveyed InformationItems are directed.<p>From package UML::InformationFlows.</p>")
	
	java.util.List<uml.Namedelement> getInformationTarget();
	void setInformationTarget(java.util.List<uml.Namedelement> informationTarget);

	@Description("Determines which Relationship will realize the specified flow.<p>From package UML::InformationFlows.</p>")
	
	java.util.List<uml.Relationship> getRealization();
	void setRealization(java.util.List<uml.Relationship> realization);

	@Description("Determines which ActivityEdges will realize the specified flow.<p>From package UML::InformationFlows.</p>")
	
	java.util.List<uml.Activityedge> getRealizingActivityEdge();
	void setRealizingActivityEdge(java.util.List<uml.Activityedge> realizingActivityEdge);

	@Description("Determines which Connectors will realize the specified flow.<p>From package UML::InformationFlows.</p>")
	
	java.util.List<uml.Connector> getRealizingConnector();
	void setRealizingConnector(java.util.List<uml.Connector> realizingConnector);

	@Description("Determines which Messages will realize the specified flow.<p>From package UML::InformationFlows.</p>")
	
	java.util.List<uml.Message> getRealizingMessage();
	void setRealizingMessage(java.util.List<uml.Message> realizingMessage);

}
