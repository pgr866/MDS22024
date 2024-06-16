import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listadonoticiasportadaidentificado')
export class VistaListadonoticiasportadaidentificado extends LitElement {
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
<vaadin-vertical-layout id="Layoutprincipallistadonoticiasportadaidentificado" style="width: 100%; position: absolute;">
 <label style="flex-shrink: 0; align-self: center; font-size: 200%; text-align: center;" id="Labelnoticiasactualidadlistadonoticiasportadaidentificado">Noticias de Actualidad</label>
 <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; height: 100%; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl); padding-top: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="" style="flex-shrink: 0; flex-wrap: wrap; padding: 0; flex-grow: 0; width: 100%; position: relative;" id="Layoutlistadonoticiasportadaidentificado">
   <div style="max-width: 1%;"></div>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
