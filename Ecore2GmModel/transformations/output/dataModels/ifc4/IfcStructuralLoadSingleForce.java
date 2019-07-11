/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadSingleForce of the Data Model iai.
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
{@link ForceX}, 
{@link ForceXAsString}, 
{@link ForceY}, 
{@link ForceYAsString}, 
{@link ForceZ}, 
{@link ForceZAsString}, 
{@link MomentX}, 
{@link MomentXAsString}, 
{@link MomentY}, 
{@link MomentYAsString}, 
{@link MomentZ}, 
{@link MomentZAsString}, 

* It provides of then following operations (getters and setters)
{@link getForceX},
{@link getForceXAsString},
{@link getForceY},
{@link getForceYAsString},
{@link getForceZ},
{@link getForceZAsString},
{@link getMomentX},
{@link getMomentXAsString},
{@link getMomentY},
{@link getMomentYAsString},
{@link getMomentZ},
{@link getMomentZAsString},
{@link setForceX},
{@link setForceXAsString},
{@link setForceY},
{@link setForceYAsString},
{@link setForceZ},
{@link setForceZAsString},
{@link setMomentX},
{@link setMomentXAsString},
{@link setMomentY},
{@link setMomentYAsString},
{@link setMomentZ},
{@link setMomentZAsString},
 */

@Description("")

public interface IfcStructuralLoadSingleForce extends GenericEntity, ifc4.IfcStructuralLoadStatic {

	EntityType<IfcStructuralLoadSingleForce> T = EntityTypes.T(IfcStructuralLoadSingleForce.class);

	/* Constants for each property name. */
	java.lang.String ForceX = "ForceX";
	java.lang.String ForceXAsString = "ForceXAsString";
	java.lang.String ForceY = "ForceY";
	java.lang.String ForceYAsString = "ForceYAsString";
	java.lang.String ForceZ = "ForceZ";
	java.lang.String ForceZAsString = "ForceZAsString";
	java.lang.String MomentX = "MomentX";
	java.lang.String MomentXAsString = "MomentXAsString";
	java.lang.String MomentY = "MomentY";
	java.lang.String MomentYAsString = "MomentYAsString";
	java.lang.String MomentZ = "MomentZ";
	java.lang.String MomentZAsString = "MomentZAsString";

	@Description("")
	@Mandatory
	java.lang.Double getForceX();
	void setForceX(java.lang.Double ForceX);
	@Description("")
	@Mandatory
	java.lang.String getForceXAsString();
	void setForceXAsString(java.lang.String ForceXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getForceY();
	void setForceY(java.lang.Double ForceY);
	@Description("")
	@Mandatory
	java.lang.String getForceYAsString();
	void setForceYAsString(java.lang.String ForceYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getForceZ();
	void setForceZ(java.lang.Double ForceZ);
	@Description("")
	@Mandatory
	java.lang.String getForceZAsString();
	void setForceZAsString(java.lang.String ForceZAsString);
	@Description("")
	@Mandatory
	java.lang.Double getMomentX();
	void setMomentX(java.lang.Double MomentX);
	@Description("")
	@Mandatory
	java.lang.String getMomentXAsString();
	void setMomentXAsString(java.lang.String MomentXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getMomentY();
	void setMomentY(java.lang.Double MomentY);
	@Description("")
	@Mandatory
	java.lang.String getMomentYAsString();
	void setMomentYAsString(java.lang.String MomentYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getMomentZ();
	void setMomentZ(java.lang.Double MomentZ);
	@Description("")
	@Mandatory
	java.lang.String getMomentZAsString();
	void setMomentZAsString(java.lang.String MomentZAsString);
}
