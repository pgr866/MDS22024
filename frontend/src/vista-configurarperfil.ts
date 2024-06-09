import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-configurarperfil')
export class VistaConfigurarperfil extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; flex-shrink: 0; position: absolute; justify-content: space-between; padding-bottom: var(--lumo-space-l);" id="Layoutconfigurarperfil" theme="spacing-s">
 <vaadin-vertical-layout style="flex-shrink: 0; width: 25%; align-self: center; height: 30%; flex-grow: 0;">
  <vaadin-vertical-layout id="Layoutfotoconfigurarperfil" style="flex-shrink: 0; width: 100%; height: 100%; flex-grow: 0;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 40%; justify-content: space-between; flex-shrink: 0; align-self: center;" theme="spacing-s">
  <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; align-items: center;" id="Layouturlimagenconfigurarperfil">
   <label style="flex-shrink: 0; width: 30%; flex-grow: 0;" id="Labelurlimagenconfigurarperfil">URL Imagen</label>
   <vaadin-text-field placeholder="URL Imagen" style="flex-shrink: 0; width: 70%;" id="Textfieldurlimagenconfigurarperfil"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;" id="Layoutnombreconfigurarperfil">
   <label style="flex-shrink: 0; width: 30%; flex-grow: 0;" id="Labelnombreconfigurarperfil">Nombre</label>
   <vaadin-text-field placeholder="Nombre" style="flex-shrink: 0; width: 70%;" id="Textfieldnombreconfigurarperfil"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;" id="Layoutapellidosconfigurarperfil">
   <label style="flex-shrink: 0; width: 30%; flex-grow: 0;" id="Labelapellidosconfigurarperfil">Apellidos</label>
   <vaadin-text-field placeholder="Apellidos" style="flex-shrink: 0; width: 70%;" id="Textfieldapellidosconfigurarperfil"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;" id="Layoutapodoconfigurarperfil">
   <label style="flex-shrink: 0; width: 30%; flex-grow: 0;" id="Labelapodoconfigurarperfil">Nick</label>
   <vaadin-text-field placeholder="Nick" style="flex-shrink: 0; width: 70%;" id="Textfieldapodoconfigurarperfil"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;" id="Layoutemailconfigurarperfil">
   <label style="flex-shrink: 0; width: 30%; flex-grow: 0;" id="Labelemailconfigurarperfil">Email</label>
   <vaadin-text-field placeholder="Email" style="flex-shrink: 0; width: 70%;" id="Textfieldemailconfigurarperfil"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;" id="Layouttelefonoconfigurarperfil">
   <label style="flex-shrink: 0; width: 30%; flex-grow: 0;" id="Labeltelefonoconfigurarperfil">Teléfono</label>
   <vaadin-text-field placeholder="Teléfono" style="flex-shrink: 0; width: 70%;" id="Textfieldtelefonoconfigurarperfil"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;" id="Layoutntarjetaconfigurarperfil">
   <label style="flex-shrink: 0; width: 30%; flex-grow: 0;" id="Labelntarjetaconfigurarperfil">Nº Tarjeta</label>
   <vaadin-text-field placeholder="Nº Tarjeta" style="flex-shrink: 0; width: 70%;" id="Textfieldntarjetaconfigurarperfil"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;" id="Layoutcontrasenaconfigurarperfil">
   <label style="flex-shrink: 0; width: 30%; flex-grow: 0;" id="Labelcontrasenaconfigurarperfil">Contraseña</label>
   <vaadin-password-field placeholder="Contraseña" style="flex-shrink: 0; width: 70%;" has-value id="Passwordfieldcontrasenaconfigurarperfil"></vaadin-password-field>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <label id="Labelerrordatosconfigurarperfil" style="flex-shrink: 0; font-size: 120%; width: 100%; font-size: 100%; text-align: center; color: #FF0000; align-self: center;"></label>
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 40%; height: 10%; justify-content: space-around; align-self: center;" id="Layoutbotonesconfigurarperfil">
  <vaadin-button style="flex-shrink: 0; width: 47%; align-self: center;" id="Buttoneliminarcuentaconfigurarperfil">
    Eliminar cuenta 
  </vaadin-button>
  <vaadin-button style="flex-shrink: 0; width: 47%; align-self: center;" id="Buttonguardarcambiosconfigurarperfil">
    Guardar cambios 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
