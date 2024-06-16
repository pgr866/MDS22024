import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listadonoticiasportadaidentificado_item')
export class VistaListadonoticiasportadaidentificado_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; max-width: 380px; padding: 0; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-l); margin-bottom: var(--lumo-space-l); min-width: 380px;">
 <vaadin-vertical-layout id="Layouttitulolistadonoticiasportadaidentificado" style="flex-shrink: 0; width: 100%; padding: 0; flex-grow: 0; margin-left: var(--lumo-space-m); height: 100%;">
  <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; height: 100%;">
   <vaadin-vertical-layout id="Layouttitulonoticiaordenarportadaidentificado" style="width: 100%; padding: 0; flex-shrink: 0; height: 100%; align-items: stretch;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-button id="Titulolistadonoticiasportadaidentificado" style="flex-shrink: 0; width: 100%; background-color: #FFFFFF; flex-grow: 0; padding: 0; height: 100%; color: #263345;">
    Título Noticia 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout id="Layoutimagenlistadonoticiasportadaidentificado" style="width: 100%; flex-shrink: 0; flex-direction: column; display: flex; flex-direction: column; justify-content: space-between; flex-grow: 1;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="Layoutautorlugarfechalistadonoticiasportadaidentificado" style="width: 100%; flex-shrink: 0; justify-content: space-between; flex-grow: 0;">
  <label style="flex-shrink: 0; width: 30%; height: 100%; text-align: center;" id="Labelfechalistadonoticiasportadaidentificado">Fecha</label>
  <label style="flex-shrink: 0; width: 30%; height: 100%; text-align: center;" id="Labelautorlistadonoticiasportadaidentificado">Autor</label>
  <label style="flex-shrink: 0; width: 30%; height: 100%; text-align: center;" id="Labellugarlistadonoticiasportadaidentificado">Lugar</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}