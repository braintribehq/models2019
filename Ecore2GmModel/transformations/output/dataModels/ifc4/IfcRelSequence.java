/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelSequence of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link RelatingProcess}, 
{@link RelatedProcess}, 
{@link TimeLag}, 
{@link SequenceType}, 
{@link UserDefinedSequenceType}, 

* It provides of then following operations (getters and setters)
{@link getRelatingProcess},
{@link getRelatedProcess},
{@link getTimeLag},
{@link getSequenceType},
{@link getUserDefinedSequenceType},
{@link setRelatingProcess},
{@link setRelatedProcess},
{@link setTimeLag},
{@link setSequenceType},
{@link setUserDefinedSequenceType},
 */

@Description("")

public interface IfcRelSequence extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelSequence> T = EntityTypes.T(IfcRelSequence.class);

	/* Constants for each property name. */
	java.lang.String RelatingProcess = "RelatingProcess";
	java.lang.String RelatedProcess = "RelatedProcess";
	java.lang.String TimeLag = "TimeLag";
	java.lang.String SequenceType = "SequenceType";
	java.lang.String UserDefinedSequenceType = "UserDefinedSequenceType";

	@Description("")
	@Mandatory
	ifc4.IfcProcess getRelatingProcess();
	void setRelatingProcess(ifc4.IfcProcess RelatingProcess);
	@Description("")
	@Mandatory
	ifc4.IfcProcess getRelatedProcess();
	void setRelatedProcess(ifc4.IfcProcess RelatedProcess);
	@Description("")
	@Mandatory
	ifc4.IfcLagTime getTimeLag();
	void setTimeLag(ifc4.IfcLagTime TimeLag);
	@Description("")
	@Mandatory
	ifc4.IfcSequenceEnum getSequenceType();
	void setSequenceType(ifc4.IfcSequenceEnum SequenceType);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedSequenceType();
	void setUserDefinedSequenceType(java.lang.String UserDefinedSequenceType);
}
