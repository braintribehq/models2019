/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcFailureConnectionCondition of the Data Model iai.
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
{@link TensionFailureX}, 
{@link TensionFailureXAsString}, 
{@link TensionFailureY}, 
{@link TensionFailureYAsString}, 
{@link TensionFailureZ}, 
{@link TensionFailureZAsString}, 
{@link CompressionFailureX}, 
{@link CompressionFailureXAsString}, 
{@link CompressionFailureY}, 
{@link CompressionFailureYAsString}, 
{@link CompressionFailureZ}, 
{@link CompressionFailureZAsString}, 

* It provides of then following operations (getters and setters)
{@link getTensionFailureX},
{@link getTensionFailureXAsString},
{@link getTensionFailureY},
{@link getTensionFailureYAsString},
{@link getTensionFailureZ},
{@link getTensionFailureZAsString},
{@link getCompressionFailureX},
{@link getCompressionFailureXAsString},
{@link getCompressionFailureY},
{@link getCompressionFailureYAsString},
{@link getCompressionFailureZ},
{@link getCompressionFailureZAsString},
{@link setTensionFailureX},
{@link setTensionFailureXAsString},
{@link setTensionFailureY},
{@link setTensionFailureYAsString},
{@link setTensionFailureZ},
{@link setTensionFailureZAsString},
{@link setCompressionFailureX},
{@link setCompressionFailureXAsString},
{@link setCompressionFailureY},
{@link setCompressionFailureYAsString},
{@link setCompressionFailureZ},
{@link setCompressionFailureZAsString},
 */

@Description("")

public interface IfcFailureConnectionCondition extends GenericEntity, ifc4.IfcStructuralConnectionCondition {

	EntityType<IfcFailureConnectionCondition> T = EntityTypes.T(IfcFailureConnectionCondition.class);

	/* Constants for each property name. */
	java.lang.String TensionFailureX = "TensionFailureX";
	java.lang.String TensionFailureXAsString = "TensionFailureXAsString";
	java.lang.String TensionFailureY = "TensionFailureY";
	java.lang.String TensionFailureYAsString = "TensionFailureYAsString";
	java.lang.String TensionFailureZ = "TensionFailureZ";
	java.lang.String TensionFailureZAsString = "TensionFailureZAsString";
	java.lang.String CompressionFailureX = "CompressionFailureX";
	java.lang.String CompressionFailureXAsString = "CompressionFailureXAsString";
	java.lang.String CompressionFailureY = "CompressionFailureY";
	java.lang.String CompressionFailureYAsString = "CompressionFailureYAsString";
	java.lang.String CompressionFailureZ = "CompressionFailureZ";
	java.lang.String CompressionFailureZAsString = "CompressionFailureZAsString";

	@Description("")
	@Mandatory
	java.lang.Double getTensionFailureX();
	void setTensionFailureX(java.lang.Double TensionFailureX);
	@Description("")
	@Mandatory
	java.lang.String getTensionFailureXAsString();
	void setTensionFailureXAsString(java.lang.String TensionFailureXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTensionFailureY();
	void setTensionFailureY(java.lang.Double TensionFailureY);
	@Description("")
	@Mandatory
	java.lang.String getTensionFailureYAsString();
	void setTensionFailureYAsString(java.lang.String TensionFailureYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTensionFailureZ();
	void setTensionFailureZ(java.lang.Double TensionFailureZ);
	@Description("")
	@Mandatory
	java.lang.String getTensionFailureZAsString();
	void setTensionFailureZAsString(java.lang.String TensionFailureZAsString);
	@Description("")
	@Mandatory
	java.lang.Double getCompressionFailureX();
	void setCompressionFailureX(java.lang.Double CompressionFailureX);
	@Description("")
	@Mandatory
	java.lang.String getCompressionFailureXAsString();
	void setCompressionFailureXAsString(java.lang.String CompressionFailureXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getCompressionFailureY();
	void setCompressionFailureY(java.lang.Double CompressionFailureY);
	@Description("")
	@Mandatory
	java.lang.String getCompressionFailureYAsString();
	void setCompressionFailureYAsString(java.lang.String CompressionFailureYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getCompressionFailureZ();
	void setCompressionFailureZ(java.lang.Double CompressionFailureZ);
	@Description("")
	@Mandatory
	java.lang.String getCompressionFailureZAsString();
	void setCompressionFailureZAsString(java.lang.String CompressionFailureZAsString);
}
